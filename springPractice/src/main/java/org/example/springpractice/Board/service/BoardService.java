package org.example.springpractice.Board.service;

import org.example.springpractice.Board.model.BoardDto;
import org.example.springpractice.Board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //게시글 등록
    public void register(BoardDto.BoardReq dto) {
        boardRepository.save(dto.toEntity());
    }

    //게시글 상세 조회
    public BoardDto.BoardRes read(Integer id) {
        return boardRepository.findById(id).map(BoardDto.BoardRes::from).orElse(null);
    }

    //게시글 목록 조회
    public List<BoardDto.BoardRes> list() {
        return boardRepository.findAll()
                .stream()
                .map(BoardDto.BoardRes::from)
                .toList();
    }

    //게시글 검색
    public List<BoardDto.BoardRes> search(String title) {
        return boardRepository.findByTitle(title)
                .stream()
                .map(BoardDto.BoardRes::from)
                .toList();
    }

}
