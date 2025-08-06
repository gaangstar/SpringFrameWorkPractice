package org.example.springpractice.Menu.controller;

import lombok.RequiredArgsConstructor;
import org.example.springpractice.Menu.model.MenuDto;
import org.example.springpractice.Menu.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController
{
    private final MenuService menuService;

    // 메뉴 등록
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MenuDto.MenuReq dto)
    {
        menuService.register(dto);

        return ResponseEntity.status(200).body("등록 완료");
    }

    // 메뉴 목록 조회
    @GetMapping("/list")
    public ResponseEntity<List<MenuDto.MenuRes>> list()
    {
        List<MenuDto.MenuRes> result = menuService.list();

        return ResponseEntity.status(200).body(result);
    }

    // 메뉴 상세 조회
    @GetMapping("/read")
    public ResponseEntity<MenuDto.MenuRes> read(Integer idx)
    {
        MenuDto.MenuRes result = menuService.read(idx);

        return ResponseEntity.status(200).body(result);
    }

    // 메뉴 검색
    @GetMapping("/search")
    public ResponseEntity<List<MenuDto.MenuRes>> search(String name)
    {
        List<MenuDto.MenuRes> result = menuService.search(name);

        return ResponseEntity.ok(result);
    }
}
