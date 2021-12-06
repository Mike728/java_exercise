package com.interview.exercise.boundary.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

    private String name;
    private String surname;

    @JsonIgnore
    private UserDto user;

}
