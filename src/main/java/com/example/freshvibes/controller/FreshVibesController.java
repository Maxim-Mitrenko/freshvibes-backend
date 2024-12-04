package com.example.freshvibes.controller;

import com.example.freshvibes.model.LoginRequest;
import com.example.freshvibes.model.LoginResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreshVibesController {

    @PostMapping("/login")
    public LoginResponse login(LoginRequest request) {
        return
    }

    @GetMapping("/logout")
    public void logout () {
        return
    }

    @PostMapping("/register") {

    }
}
