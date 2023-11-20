package com.photocompetition.photocompetition.controller;

import com.photocompetition.photocompetition.dto.UserDto;
import com.photocompetition.photocompetition.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("user")
@CrossOrigin(maxAge = 500)
public class UserController {

    private UserService userService;

    @PostMapping("add")
    public void addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    @GetMapping("all")
    public ResponseEntity<List<UserDto>> getUser() {
        return new ResponseEntity<>(userService.getUser(), HttpStatus.ACCEPTED);
    }

}
