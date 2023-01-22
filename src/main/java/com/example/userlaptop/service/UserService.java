package com.example.userlaptop.service;

import com.example.userlaptop.entity.User;

public interface UserService {
    String addUser(User user);

    User getUser(Integer userId);

    String deleteUser(Integer userId);
}
