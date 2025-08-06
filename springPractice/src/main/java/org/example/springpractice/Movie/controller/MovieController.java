package org.example.springpractice.Movie.controller;

import org.example.springpractice.Movie.model.MovieDto;
import org.example.springpractice.Movie.service.MovieService;
import org.example.springpractice.product.model.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController
{
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // 영화 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MovieDto.MovieReq dto) {
        movieService.register(dto);

        return ResponseEntity.ok("등록 성공");
    }

    @GetMapping("/read")
    public ResponseEntity<MovieDto.MovieRes> read(@RequestParam Integer idx) {
        MovieDto.MovieRes response = movieService.read(idx);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieDto.MovieRes>> list() {
        List<MovieDto.MovieRes> response = movieService.list();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieDto.MovieRes>> search(@RequestParam String search) {
        List<MovieDto.MovieRes> response = movieService.search(search);
        return ResponseEntity.ok(response);
    }
}
