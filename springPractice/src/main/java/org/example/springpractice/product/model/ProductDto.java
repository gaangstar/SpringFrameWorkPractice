package org.example.springpractice.product.model;

import lombok.Builder;
import lombok.Getter;

public class ProductDto {
    @Getter
    public static class ProductReq {
        private String name;
        private Integer price;
        private String description;

        public Product toEntity() {
            Product entity = Product.builder()
                    .name(this.name)
                    .price(this.price)
                    .description(this.description)
                    .build();
            return new Product(name, price, description);
        }
      
    }
    
    @Builder
    @Getter
    public static class ProductRes
    {
        private Long id;
        private String name;
        private Integer price;
        private String description;
        
        public static ProductRes from(Product product)
        {
            ProductDto.ProductRes res = ProductRes.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .price(product.getPrice())
                    .description(product.getDescription())
                    .build();
            
            return res;
        }
        
    }
}
