package com.interview.exercise.boundary.dto;

import lombok.Data;

import java.util.List;

@Data
public class CourierDto {

    private String name;
    private String surname;
    public List<PackageDto> packages;
}
