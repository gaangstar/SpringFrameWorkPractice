package org.example.springpractice.Board.service;

import org.example.springpractice.Board.model.BoardDto;
import org.example.springpractice.Board.repository.BoardRepository;
import org.springframework.stereotype.Service;


@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //게시글 등록
    public void register(BoardDto.BoardReq dto) {
        boardRepository.save(dto);
    }
}
