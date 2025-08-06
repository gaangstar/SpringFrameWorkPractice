package org.example.springpractice.product.service;

import org.example.springpractice.product.model.Product;
import org.example.springpractice.product.model.ProductDto;
import org.example.springpractice.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;
    
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }
    
    public void register(ProductDto.ProductReq dto)
    {
        productRepository.register(dto.toEntity());
    }
    
    public List<ProductDto.ProductReq> list()
    {
        List<Product> result = productRepository.list();
        
        
        return result.stream().map(ProductDto.ProductReq::from).toList();
    }
    
    public ProductDto.ProductReq read(Integer idx)
    {
        Optional<ProductDto.ProductReq> result = productRepository.read(idx);
        
        if(result.isEmpty())
        {
            return null;
        }
        
        Product entity = result.get();
        
        return ProductDto.ProductReq.from(entity);
    }
    
    public List<ProductDto.ProductReq> search(String name)
    {
        List<Product> result = productRepository.findByName(name);
        
        return result.stream().map(ProductDto.ProductReq::from).toList();
    }
    
    
    
    
}
