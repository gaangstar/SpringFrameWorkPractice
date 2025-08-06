package org.example.springpractice.Board.model;

import lombok.Builder;
import lombok.Getter;

public class BoardDto
{
    @Getter
    public static class BoardReq {
        private String title;
        private String content;

        public Board toEntity() {
            Board entity = Board.builder()
                    .title(this.title)
                    .content(this.content)
                    .build();
            return entity;
        }

        
    }
    
    @Getter
    @Builder
    public static class BoardRes
    {
        private Integer idx;
        private String title;
        private String content;
        
        public static BoardRes from(Board board)
        {
            BoardRes res = BoardRes.builder()
                    .idx(board.getIdx())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .build();
            
            return res;
        }
        
        
    }
}
