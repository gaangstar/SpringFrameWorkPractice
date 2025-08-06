package org.example.springpractice.Lecture.model;

import lombok.Builder;
import lombok.Getter;

public class LectureDto
{
    @Getter
    public static class LectureReq {
        private String title;
        private String description;
        private Integer totalTime;
        private Integer price;

        public Lecture toEntity() {
            return Lecture.builder()
                    .title(title)
                    .description(description)
                    .time(totalTime)
                    .price(price)
                    .build();
        }

    }

    @Builder
    @Getter
    public static class LectureRes {
        private Integer id;
        private String title;
        private String description;
        private Integer totalTime;
        private Integer price;

        public static LectureRes from(Lecture lecture) {

            return LectureRes.builder()
                    .id(lecture.getId())
                    .title(lecture.getTitle())
                    .description(lecture.getDescription())
                    .totalTime(lecture.getTime())
                    .price(lecture.getPrice())
                    .build();
        }

    }
}
