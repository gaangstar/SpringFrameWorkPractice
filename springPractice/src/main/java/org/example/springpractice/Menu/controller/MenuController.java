package org.example.springpractice.Menu.controller;

import org.example.springpractice.Menu.model.MenuDto;
import org.example.springpractice.Menu.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController
{
    private final MenuService menuService;
    
    public MenuController(MenuService menuService) { this.menuService = menuService; }
    
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody MenuDto.menuRegister dto)
    {
        menuService.register(dto);
        
        return ResponseEntity.status(200).body("등록 완료");
    }
    
    @GetMapping("/list")
    public ResponseEntity list()
    {
        List<MenuDto.menuReq> result = menuService.list();
        
        return ResponseEntity.status(200).body(result);
    }
    
    @GetMapping("/read")
    public ResponseEntity read(Integer idx)
    {
        List<MenuDto.menuReq> result = menuService.read(idx);
        
        return ResponseEntity.status(200).body(result);
    }
    
    @GetMapping("/search")
    public ResponseEntity search(String name)
    {
        List<MenuDto.menuReq> result = menuService.search(name);
        
        return ResponseEntity.status(200).body(result);
    }
}
