package com.photocompetition.photocompetition.service;


import com.photocompetition.photocompetition.dto.UserDto;
import com.photocompetition.photocompetition.mapper.UserDtoMapper;
import com.photocompetition.photocompetition.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class UserService {
    UserRepository userRepository;
    UserDtoMapper userDtoMapper;
    public void addUser(UserDto userDto){
        userRepository.save(userDtoMapper.dtoToEntity(userDto));
    }

    public List<UserDto> getUser()
    {
        return userRepository.findAll().stream().map(userDtoMapper::entityToDto).collect(Collectors.toList());
    }
}
