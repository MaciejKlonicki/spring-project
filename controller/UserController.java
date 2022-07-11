package com.example.springytlearning.controller;

import com.example.springytlearning.entity.User;
import com.example.springytlearning.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/users")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //getting all users
    @GetMapping
    private List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //getting single user
    @GetMapping("/{id}")
    private User getSingleUser (@PathVariable Integer id) {
        return userService.getSingleUser(id);
    }

    //adding new users
    @PostMapping
    private User saveUser (@RequestBody User user) {
        return userService.saveOrUpdate(user);
    }
}
