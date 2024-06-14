package com.taller.moto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taller.moto.dto.BikeDto;
import com.taller.moto.dto.UserDto;
import com.taller.moto.mappers.BikeMappers;
import com.taller.moto.models.Bike;
import com.taller.moto.models.Users;
import com.taller.moto.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    private final BikeMappers bikeMappers;

    public UserController(UserService userService, BikeMappers bikeMappers) {
        this.userService = userService;
        this.bikeMappers = bikeMappers;
    }

    @GetMapping("/{document}")
    public String getUser(@PathVariable(name = "document") String document, Model models) {

        Users users = userService.finByIdUsers(document);

        models.addAttribute("user", users);

        return "user/user";
    }

    @GetMapping("/{document}/bike")
    public String formBike(@PathVariable(name = "document") String document, Model model) {
        model.addAttribute("BikeDto", new BikeDto());
        Users users = userService.finByIdUsers(document);
        model.addAttribute("user", users);

        return "user/formBike";
    }

    @PostMapping("/{document}/addbike")
    public String postMethodName(@PathVariable(name = "document") String document,
            @ModelAttribute("BikeDto") BikeDto bikeDto) {
        Bike bike = bikeMappers.toBike(bikeDto);
        Users users = userService.finByIdUsers(document);
        userService.saveBike(bike, users);
        return "redirect:/user/{document}/bike";
    }
}
