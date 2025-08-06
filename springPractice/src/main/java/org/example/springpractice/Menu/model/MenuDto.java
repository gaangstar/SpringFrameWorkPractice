package org.example.springpractice.Menu.model;

import lombok.Builder;
import lombok.Getter;

public class MenuDto
{

    @Getter
    public static class MenuReq
    {
        private String name;
        private Integer price;
        private Integer calorie;

        public Menu toEntity() {
            return Menu.builder()
                    .name(name)
                    .price(price)
                    .calorie(calorie)
                    .build();
            }
    }

    @Builder
    @Getter
    public static class MenuRes {
        private Integer idx;
        private String name;
        private Integer price;
        private Integer calories;

        public static MenuRes from(Menu menu) {
            return MenuRes.builder()
                    .idx(menu.getIdx())
                    .name(menu.getName())
                    .price(menu.getPrice())
                    .calories(menu.getCalorie())
                    .build();
        }
    }
}
