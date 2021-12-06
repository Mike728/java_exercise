package com.interview.exercise.control.mapper;

import com.interview.exercise.entity.Package;
import org.mapstruct.Mapper;

@Mapper
public interface PackageMapper {

    Package packageToPackageDto(Package packagee);

}
