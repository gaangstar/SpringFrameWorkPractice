package org.example.springpractice.Lecture.repository;

import org.example.springpractice.Lecture.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Integer>
{
    List<Lecture> findByTitle(String title);
}
