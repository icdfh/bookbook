package com.example.booooks.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "produts")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
