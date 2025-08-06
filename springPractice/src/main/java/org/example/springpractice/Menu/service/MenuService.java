package org.example.springpractice.Menu.service;

import org.example.springpractice.Menu.model.MenuDto;
import org.example.springpractice.Menu.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService
{
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void register(MenuDto.MenuReq dto) {
        menuRepository.save(dto.toEntity());
    }

    public List<MenuDto.MenuRes> list() {
        return menuRepository.findAll()
                .stream()
                .map(MenuDto.MenuRes::from)
                .toList();
    }

    public MenuDto.MenuRes read(Integer id) {
        return menuRepository.findById(id)
                .map(MenuDto.MenuRes::from).orElse(null);
    }

    public List<MenuDto.MenuRes> search(String name) {
        return menuRepository.findByName(name)
                .stream()
                .map(MenuDto.MenuRes::from)
                .toList();
    }
}
