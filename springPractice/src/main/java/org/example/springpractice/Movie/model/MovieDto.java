package org.example.springpractice.Movie.model;

import lombok.Builder;
import lombok.Getter;

public class MovieDto
{
    @Getter
    public static class MovieReq {
        private String title;
        private String description;
        private Integer time;

        public Movie toEntity() {
            return Movie.builder()
                    .title(title)
                    .description(description)
                    .time(time)
                    .build();
        }
    }

    @Builder
    @Getter
    public static class MovieRes {
        private Integer id;
        private String title;
        private String description;
        private Integer time;

        public static MovieRes from(Movie movie) {
            return MovieRes.builder()
                    .id(movie.getId())
                    .title(movie.getTitle())
                    .description(movie.getDescription())
                    .time(movie.getTime())
                    .build();
        }
    }
}
