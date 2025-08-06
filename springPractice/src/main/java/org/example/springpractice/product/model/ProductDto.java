package org.example.springpractice.product.model;

public class ProductDto
{
    public static class ProductReq
    {
        private Integer idx;
        private String name;
        private Integer price;
        private Integer description ;
        
        public static  ProductReq from(Product Entity)
        {
            ProductDto.ProductReq dto = new ProductDto.ProductReq();
            dto.setIdx(Entity.getIdx);
            dto.setName(Entity.getName);
            dto.setPrice(Entity.getPrice);
            dto.setDescription(Entity.getDescription);
            
            return dto;
        }
        
        public Product toEntity()
        {
            Product entity = new Product();
            entity.setName(this.name);
            entity.setPrice(this.price);
            entity.setDescription(this.description );
            
            return entity;
        }
        
        
        public Integer getIdx()
        {
            return idx;
        }
        
        public void setIdx(Integer idx)
        {
            this.idx = idx;
        }
        
        public String getName()
        {
            return name;
        }
        
        public void setName(String name)
        {
            this.name = name;
        }
        
        public Integer getPrice()
        {
            return price;
        }
        
        public void setPrice(Integer price)
        {
            this.price = price;
        }
        
        public Integer getDescription()
        {
            return description;
        }
        
        public void setDescription(Integer description)
        {
            this.description = description;
        }
    }
    
}
