package com.interview.exercise.boundary;


import com.interview.exercise.boundary.dto.CourierDto;
import com.interview.exercise.control.CourierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/courier")
@RequiredArgsConstructor
public class CourierResource {

    private final CourierRepository courierRepository;

    @PostMapping
    public void addCourier(CourierDto courierDto) {
        //ToDo map dto -> entity then save
    }
}
