package com.photocompetition.photocompetition.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name = "user")
@Data
public class User {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private long phone;
    private String email;
    private String address;
    private String password;
}
