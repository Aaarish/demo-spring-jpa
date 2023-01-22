package com.example.userlaptop.dao;

import com.example.userlaptop.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDao extends JpaRepository<Laptop,Integer> {
    Laptop findByLaptopId(Integer laptopId);
}
