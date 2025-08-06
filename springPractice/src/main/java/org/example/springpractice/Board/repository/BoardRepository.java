package org.example.springpractice.Board.repository;

import org.example.springpractice.Board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer>
{
    List<Board> findByTitle(String title);
}
