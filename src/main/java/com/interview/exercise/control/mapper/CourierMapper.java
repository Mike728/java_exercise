package com.interview.exercise.control.mapper;

import com.interview.exercise.boundary.dto.CourierDto;
import com.interview.exercise.entity.Courier;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourierMapper {

    CourierMapper INSTANCE = Mappers.getMapper( CourierMapper.class );

    CourierDto courierToCourierDto(Courier courier);

}
