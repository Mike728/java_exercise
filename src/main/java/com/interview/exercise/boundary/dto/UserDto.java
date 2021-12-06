package com.interview.exercise.boundary.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDto {

    private String name;
    private String surname;
    private List<RoleDto> role;
}
