package com.interview.exercise.control;

import com.interview.exercise.entity.Package;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PackageRepository extends PagingAndSortingRepository<Package, Integer> {
}
