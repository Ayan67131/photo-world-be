package com.photocompetition.photocompetition.mapper;

import com.photocompetition.photocompetition.dto.UserDto;
import com.photocompetition.photocompetition.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {
    User dtoToEntity(UserDto userDto);
    UserDto entityToDto(User user);
}
