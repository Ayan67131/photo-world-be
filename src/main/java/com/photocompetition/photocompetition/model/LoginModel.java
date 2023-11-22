package com.photocompetition.photocompetition.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginModel {
    private String userName;
    private String password;
}
