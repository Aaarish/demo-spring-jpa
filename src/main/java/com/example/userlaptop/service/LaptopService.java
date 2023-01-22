package com.example.userlaptop.service;

import com.example.userlaptop.entity.Laptop;

public interface LaptopService {
    String addLaptop(Laptop laptop);

    Laptop getLaptop(Integer laptopId);

    String deleteLaptop(Integer laptopId);
}
