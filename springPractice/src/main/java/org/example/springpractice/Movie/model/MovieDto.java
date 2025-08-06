package org.example.springpractice.Movie.model;

public class MovieDto
{
    public static class MovieReq {
        private String title;
        private String description;
        private Integer time;

        public Movie toMovie() {
            return new Movie(title, description, time);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Movie toEntity() {
            return new Movie(title, description, time);
        }
    }

    public static class MovieRes {
        private Integer id;
        private String title;
        private String description;
        private Integer time;

        public static MovieRes from(Movie movie) {
            MovieRes res = new MovieRes();
            res.id = movie.getId();
            res.title = movie.getTitle();
            res.description = movie.getDescription();
            res.time = movie.getTime();

            return res;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }
    }
}
