package org.example.springpractice.product.service;

import org.example.springpractice.product.model.ProductDto;
import org.example.springpractice.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void register(ProductDto.ProductReq dto) {
        productRepository.save(dto.toEntity());
    }

    public List<ProductDto.ProductRes> list() {
        return productRepository.findAll()
                .stream()
                .map(ProductDto.ProductRes::from)
                .toList();
    }

    public ProductDto.ProductRes read(Long id) {
        return productRepository.findById(id)
                .map(ProductDto.ProductRes::from).orElse(null);
    }

    public List<ProductDto.ProductRes> search(String name) {
        return productRepository.findByName(name)
                .stream()
                .map(ProductDto.ProductRes::from)
                .toList();
    }
}
