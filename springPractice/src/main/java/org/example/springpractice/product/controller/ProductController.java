package org.example.springpractice.product.controller;

import org.example.springpractice.product.model.ProductDto;
import org.example.springpractice.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // 상품 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody ProductDto.ProductReq dto) {
        productService.register(dto);
        return ResponseEntity.ok("등록 성공");
    }

    // 상품 상세 조회
    @GetMapping("/read")
    public ResponseEntity<ProductDto.ProductRes> read(@RequestParam Long idx) {
        ProductDto.ProductRes response = productService.read(idx);
        return ResponseEntity.ok(response);
    }

    // 상품 목록 조회
    @GetMapping("/list")
    public ResponseEntity<List<ProductDto.ProductRes>> list() {
        List<ProductDto.ProductRes> response = productService.list();
        return ResponseEntity.ok(response);
    }

    // 상품 검색
    @GetMapping("/search")
    public ResponseEntity<List<ProductDto.ProductRes>> search(@RequestParam String name) {
        List<ProductDto.ProductRes> response = productService.search(name);
        return ResponseEntity.ok(response);
    }
}
