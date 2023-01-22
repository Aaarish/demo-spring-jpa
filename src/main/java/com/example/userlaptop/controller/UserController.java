package com.example.userlaptop.controller;

import com.example.userlaptop.entity.User;
import com.example.userlaptop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }
}
