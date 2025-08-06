package org.example.springpractice.Lecture.service;

import org.example.springpractice.Lecture.model.LectureDto;
import org.example.springpractice.Lecture.repository.LectureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService
{
    private LectureRepository lectureRepository;
    
    public LectureService(LectureRepository lectureRepository)
    {
        this.lectureRepository = lectureRepository;
    }
    
    public void register(LectureDto.register dto)
    {
        lectureRepository.save(dto);
    }
    
    public List<LectureDto.lectureRes> list()
    {
        List<LectureDto.lectureRes> result = ectureRepository.findAll();
        
        return result.stream().map(LectureDto.lectureRes::from).toList();
    }
    
    public List<LectureDto.lectureRes> list(String title)
    {
        List<LectureDto.lectureRes> result = ectureRepository.findByTitle(title);
        
        return result.stream().map(LectureDto.lectureRes::from).toList();
    }
    
    public List<LectureDto.lectureRes> read(Integer idx)
    {
        List<LectureDto.lectureRes> result = ectureRepository.findByid(idx);
        
        return result.stream().map(LectureDto.lectureRes::from).toList();
    }
    
    
}
