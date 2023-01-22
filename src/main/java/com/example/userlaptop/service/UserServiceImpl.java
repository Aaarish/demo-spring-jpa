package com.example.userlaptop.service;

import com.example.userlaptop.dao.UserDao;
import com.example.userlaptop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String addUser(User user) {
        User savedUser = userDao.save(user);
        return savedUser.getUserName();
    }

    @Override
    public User getUser(Integer userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public String deleteUser(Integer userId) {
        userDao.deleteById(userId);
        return "User deleted";
    }
}
