package com.interview.exercise.boundary;

import com.interview.exercise.control.PackageRepository;
import com.interview.exercise.entity.Package;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/package")
@RequiredArgsConstructor
@Slf4j
public class PackageResource {

    private final PackageRepository packageRepository;

    @GetMapping
    public Page<Package> getAllPackagesInSystem(Pageable pageable) {
        return packageRepository.findAll(pageable);
    }

}
