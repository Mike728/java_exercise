package com.interview.exercise.control;

import com.interview.exercise.entity.Courier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourierRepository extends CrudRepository<Courier, Long> {

    Optional<Courier> findByName(String name);

    Optional<Courier> findBySurname(String surname);

    List<Courier> findByPackagesIsNotEmpty();
}
