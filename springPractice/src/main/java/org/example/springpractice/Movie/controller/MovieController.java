package org.example.springpractice.Movie.controller;

import lombok.RequiredArgsConstructor;
import org.example.springpractice.Movie.model.MovieDto;
import org.example.springpractice.Movie.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController
{
    private final MovieService movieService;


    // 영화 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MovieDto.MovieReq dto) {
        movieService.register(dto);

        return ResponseEntity.ok("등록 성공");
    }

    // 영화 상세 조회
    @GetMapping("/read")
    public ResponseEntity<MovieDto.MovieRes> read(@RequestParam Integer idx) {
        MovieDto.MovieRes response = movieService.read(idx);
        return ResponseEntity.ok(response);
    }

    // 영화 목록 조회
    @GetMapping("/list")
    public ResponseEntity<List<MovieDto.MovieRes>> list() {
        List<MovieDto.MovieRes> response = movieService.list();

        return ResponseEntity.ok(response);
    }

    // 영화 검색
    @GetMapping("/search")
    public ResponseEntity<List<MovieDto.MovieRes>> search(@RequestParam String search) {
        List<MovieDto.MovieRes> response = movieService.search(search);
        return ResponseEntity.ok(response);
    }
}
