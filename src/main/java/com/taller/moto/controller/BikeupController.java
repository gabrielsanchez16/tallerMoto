package com.taller.moto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taller.moto.dto.UserDto;
import com.taller.moto.mappers.UserMapper;
import com.taller.moto.models.Users;
import com.taller.moto.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/bikeup")
public class BikeupController {

    private final UserService userService;
    private final UserMapper UserMapper;

    public BikeupController(UserService userService, UserMapper UserMapper) {
        this.userService = userService;
        this.UserMapper = UserMapper;
    }

    @GetMapping("/start")
    public String showIndex() {
        return "start/index";
    }

    @GetMapping("/form")
    public String showFormUser(Model modelo) {
        modelo.addAttribute("UserDto", new UserDto());
        return "start/formUser";
    }

    @PostMapping("/save")
    public String postMethodName(@ModelAttribute("UserDto") UserDto userDto) {

        Users users = UserMapper.toUsers(userDto);

        userService.saveUsers(users);

        return "redirect:/bikeup/start";
    }

}