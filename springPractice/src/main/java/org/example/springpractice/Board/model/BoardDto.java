package org.example.springpractice.Board.model;

public class BoardDto
{
    public static class BoardReq {
        private String title;
        private String content;

        public Board toEntity() {
            return new Board(title, content);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class BoardRes {
        private Integer idx;
        private String title;
        private String content;

        public static BoardRes from(Board board) {
            BoardRes res = new BoardRes();

            res.idx = board.getIdx();
            res.title = board.getTitle();
            res.content = board.getContent();

            return res;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
