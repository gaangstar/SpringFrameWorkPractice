package org.example.springpractice.Lecture.controller;

import org.example.springpractice.Lecture.model.LectureDto;
import org.example.springpractice.Lecture.service.LectureService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lecture")
public class LectureController
{
    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    //강의 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody LectureDto.LectureReq dto) {
        lectureService.register(dto);
        return ResponseEntity.ok("등록 성공");
    }

    //강의 상세 조회
    @GetMapping("/read")
    public ResponseEntity<LectureDto.LectureRes> read(@RequestParam Integer idx) {
        LectureDto.LectureRes response = lectureService.read(idx);
        return ResponseEntity.ok(response);
    }

    //강의 목록 조회
    @GetMapping("/list")
    public ResponseEntity<List<LectureDto.LectureRes>> list() {
        List<LectureDto.LectureRes> response = lectureService.list();
        return ResponseEntity.ok(response);
    }

    //강의 검색
    @GetMapping("/search")
    public ResponseEntity<List<LectureDto.LectureRes>> search(@RequestParm String title) {
        List<LectureDto.LectureRes> response = lectureService.search(title);
        return ResponseEntity.ok(response);
    }

}
