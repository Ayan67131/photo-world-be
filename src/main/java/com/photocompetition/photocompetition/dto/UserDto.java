package com.photocompetition.photocompetition.dto;

import lombok.*;

@Data
public class UserDto {
    private int id;
    private String name;
    private long phone;
    private String email;
    private String address;
}
