package org.example.springpractice.product.model;

public class ProductDto {
    public static class ProductReq {
        private String name;
        private Integer price;
        private String description;

        public Product toEntity() {
            return new Product(name, price, description);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ProductRes {
        private Long id;
        private String name;
        private Integer price;
        private String description;

        public static ProductRes from(Product product) {
            ProductRes res = new ProductRes();
            res.id = product.getId();
            res.name = product.getName();
            res.price = product.getPrice();
            res.description = product.getDescription();
            return res;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
