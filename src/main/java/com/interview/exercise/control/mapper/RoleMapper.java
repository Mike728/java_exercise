package com.interview.exercise.control.mapper;

import com.interview.exercise.boundary.dto.RoleDto;
import com.interview.exercise.entity.Role;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {

     Role roleDtoToRole(RoleDto roleDto);

     default String nameToUpper(RoleDto roleDto) {
        return roleDto.getName().toUpperCase();
    }
}
