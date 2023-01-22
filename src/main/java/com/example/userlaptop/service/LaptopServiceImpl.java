package com.example.userlaptop.service;

import com.example.userlaptop.dao.LaptopDao;
import com.example.userlaptop.entity.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {
    @Autowired
    private LaptopDao laptopDao;

    @Override
    public String addLaptop(Laptop laptop) {
        Laptop savedLaptop = laptopDao.save(laptop);
        return savedLaptop.getLaptopName();
    }

    @Override
    public Laptop getLaptop(Integer laptopId) {
        return laptopDao.findByLaptopId(laptopId);
    }

    @Override
    public String deleteLaptop(Integer laptopId) {
        laptopDao.deleteById(laptopId);
        return "Laptop deleted";
    }
}
