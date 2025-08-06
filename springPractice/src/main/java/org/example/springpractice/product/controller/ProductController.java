package org.example.springpractice.product.controller;

import org.example.springpractice.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //상품 등록
    @PostMapping("/register")
    public ResponseEntity<ProductDto.ProductRsp> register(@RequestBody ProductDto.ProductReq dto) {
        productService.register(dto);

        return ResponseEntity.status(200).body("등록 성공");
    }

    //상품 상세 조회
    @GetMapping("/read")
    public ResponseEntity<ProductDto.ProductRsp> read(Integer idx) {
        ProductDto.Product response = productService.read(idx);

        return ResponseEntity.status(200).body(response);
    }


    //상품 목록 조회
    @GetMapping("/list")
    public ResponseEntity<ProductDto.ProductRsp> list() {
        List<ProductDto.Product> response = productService.list();

        return ResponseEntity.status(200).body(response);
    }

    //상품 검색
    @GetMapping("/search")
    public ResponseEntity<ProductDto.ProductRsp> search(String name) {
        List<ProductDto.Product> response = productService.search(name);

        return ResponseEntity.status(200).body(response);
    }
}
