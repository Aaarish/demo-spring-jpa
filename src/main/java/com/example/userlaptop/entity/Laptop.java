package com.example.userlaptop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "LAPTOP")
public class Laptop {
    @Id
    private Integer laptopId;
    private String laptopName;
}
