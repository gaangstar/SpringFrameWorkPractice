package org.example.springpractice.Movie.service;

import org.example.springpractice.Movie.model.MovieDto;
import org.example.springpractice.Movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository)
    {
        this.movieRepository = movieRepository;
    }

    //영화 등록
    public void register(MovieDto.MovieReq dto) {
        movieRepository.save(dto.toEntity());
    }

    //영화 상세 조회
    public MovieDto.MovieRes read(Integer id) {
        return movieRepository.findById(id)
                .map(MovieDto.MovieRes::from).orElse(null);
    }

    //영화 목록 조회
    public List<MovieDto.MovieRes> list() {
        return movieRepository.findAll()
                .stream()
                .map(MovieDto.MovieRes::from)
                .toList();
    }

    //영화 검색
    public List<MovieDto.MovieRes> search(String title) {
        return movieRepository.findByTitle(title)
                .stream()
                .map(MovieDto.MovieRes::from)
                .toList();
    }
}
