package com.example.spring.controller;

import com.example.spring.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/user")
    public User getUser() {
        User user = new User(1, "John Doe", "Software Engineer");
        return user;
    }
}
