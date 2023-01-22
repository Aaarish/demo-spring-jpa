package com.example.userlaptop.controller;

import com.example.userlaptop.entity.Laptop;
import com.example.userlaptop.service.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private LaptopServiceImpl laptopService;

    @PostMapping("/")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable Integer laptopId){
        return laptopService.getLaptop(laptopId);
    }

    @DeleteMapping("/{laptopId}")
    public String deleteLaptop(@PathVariable Integer laptopId){
        return laptopService.deleteLaptop(laptopId);
    }
}
