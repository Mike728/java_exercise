package com.interview.exercise.control.mapper;


import com.interview.exercise.boundary.dto.UserDto;
import com.interview.exercise.entity.User;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;

@Mapper
public interface UserMapper {

    User userDtoToAppUser(UserDto userDto);

    default LocalDateTime modifyInsertName (UserDto userDto) {
        return LocalDateTime.now();
    }
}
