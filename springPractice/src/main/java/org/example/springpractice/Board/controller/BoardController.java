package org.example.springpractice.Board.controller;

import org.example.springpractice.Board.model.Board;
import org.example.springpractice.Board.model.BoardDto;
import org.example.springpractice.Board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController
{

    private final BoardService boardService;

    public BoardController(BoardService boardService)
    {
        this.boardService = boardService;
    }

    // 게시글 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody BoardDto.BoardReq dto)
    {
        boardService.register(dto);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/read")
    public ResponseEntity<BoardDto.BoardRes> read (@RequestParam Integer idx) {
        BoardDto.BoardRes res = boardService.read(idx);

        return ResponseEntity.ok(res);
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardDto.BoardRes>> list() {
        List<BoardDto.BoardRes> res = boardService.list();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/search")
    public ResponseEntity<List<BoardDto.BoardRes>> search(@RequestParam String title) {
        List<BoardDto.BoardRes> res = boardService.search(title);
        return ResponseEntity.ok(res);
    }
}
