package com.interview.exercise.boundary.dto;

import com.interview.exercise.entity.Status;
import lombok.Data;

@Data
public class PackageDto {

    private UserDto user;
    private Status status;
}
