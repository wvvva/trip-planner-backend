package com.springboot.trip_planner_backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.DriverLicense;
import com.springboot.trip_planner_backend.repository.DriverLicenseRepository;

@Service
public class DriverLicenseService {
    @Autowired
    private DriverLicenseRepository driverLicenseRepository;

    public Optional<DriverLicense> findById(Long id) {
        return driverLicenseRepository.findById(id);
    }
    
    public DriverLicense save(DriverLicense driverLicense) {
        return driverLicenseRepository.save(driverLicense);
    }

    public void delete(DriverLicense driverLicense) {
        driverLicense.setIsDeleted(true);
        driverLicenseRepository.save(driverLicense);
    }
} 