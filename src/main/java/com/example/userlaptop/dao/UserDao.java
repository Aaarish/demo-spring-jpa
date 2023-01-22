package com.example.userlaptop.dao;

import com.example.userlaptop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    User findByUserId(Integer userId);
}
