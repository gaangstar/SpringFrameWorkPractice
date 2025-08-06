package org.example.springpractice.Lecture.model;

public class LectureDto
{
    public static class LectureReq {
        private String title;
        private String description;
        private Integer totalTime;
        private Integer price;

        public Lecture toEntity() {
            return new Lecture(title, description, totalTime, price);
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

        public Integer getTotalTime() {
            return totalTime;
        }

        public void setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }


    public static class LectureRes {
        private Integer id;
        private String title;
        private String description;
        private Integer totalTime;
        private Integer price;

        public static LectureRes from(Lecture lecture) {
            LectureRes res = new LectureRes();
            res.id = lecture.getId();
            res.title = lecture.getTitle();
            res.description = lecture.getDescription();
            res.totalTime = lecture.getTotalTime();
            res.price = lecture.getPrice();

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

        public Integer getTotalTime() {
            return totalTime;
        }

        public void setTotalTime(Integer totalTime) {
            this.totalTime = totalTime;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
