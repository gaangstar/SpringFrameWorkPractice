package org.example.springpractice.Movie.repository;

import org.example.springpractice.Movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer>
{
    List<Movie> findByTitle(String title);
}
