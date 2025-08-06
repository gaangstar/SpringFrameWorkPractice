package org.example.springpractice.Menu.model;

public class MenuDto
{
    public static class MenuReq
    {
        private String name;
        private Integer price;
        private Integer calorie;

        public Menu toEntity() {
            return new Menu(name, price, calorie);
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

        public Integer getCalorie() {
            return calorie;
        }

        public void setCalorie(Integer calorie) {
            this.calorie = calorie;
        }
    }

    public static class MenuRes {

        private Integer id;
        private String name;
        private Integer price;
        private Integer calorie;

        public static MenuRes from(Menu menu) {
            MenuRes res = new  MenuRes();

            res.id = menu.getIdx();
            res.name = menu.getName();
            res.price = menu.getPrice();
            res.calorie = menu.getCalorie();

            return res;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
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

        public Integer getCalorie() {
            return calorie;
        }

        public void setCalorie(Integer calorie) {
            this.calorie = calorie;
        }
    }
}
