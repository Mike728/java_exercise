package com.interview.exercise.control.mapper;

import com.interview.exercise.boundary.dto.CourierDto;
import com.interview.exercise.entity.Courier;
import org.mapstruct.Mapper;

@Mapper
public interface CourierMapper {

    CourierDto courierToCourierDto(Courier courier);

}
