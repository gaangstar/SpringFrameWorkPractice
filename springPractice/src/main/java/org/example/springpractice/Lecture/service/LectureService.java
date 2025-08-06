package org.example.springpractice.Lecture.service;

import lombok.RequiredArgsConstructor;
import org.example.springpractice.Lecture.model.Lecture;
import org.example.springpractice.Lecture.model.LectureDto;
import org.example.springpractice.Lecture.repository.LectureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LectureService
{
    private final LectureRepository lectureRepository;
    
    public void register(LectureDto.LectureReq dto)
    {
        lectureRepository.save(dto.toEntity());
    }
    
    public LectureDto.LectureRes read(Integer idx)
    {
        Optional<Lecture> result = lectureRepository.findById(idx);
        
        return result.map(LectureDto.LectureRes::from).orElse(null);
    }
    
    public List<LectureDto.LectureRes> list()
    {
        List<Lecture> result = lectureRepository.findAll();
        
        return result.stream().map(LectureDto.LectureRes::from).toList();
    }
    
    public List<LectureDto.LectureRes> search(String title)
    {
        List<Lecture> result = lectureRepository.findByTitle(title);
        
        return result.stream().map(LectureDto.LectureRes::from).toList();
    }
    
    
}
