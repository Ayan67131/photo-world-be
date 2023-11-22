package com.photocompetition.photocompetition.service;

import com.photocompetition.photocompetition.entity.User;
import com.photocompetition.photocompetition.model.LoginModel;
import com.photocompetition.photocompetition.repository.UserRepository;
import com.photocompetition.photocompetition.util.SecurityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    UserService userService;
    UserRepository userRepository;
    SecurityManager securityManager;

    public boolean checkLogin(LoginModel loginModel){
        User user = userRepository.findByEmail(loginModel.getUserName()).stream().findFirst().orElseThrow();
        return securityManager.checkPassword(loginModel.getPassword(), user.getPassword());
    }
}
