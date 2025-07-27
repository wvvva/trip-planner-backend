package com.springboot.trip_planner_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Passport;
import com.springboot.trip_planner_backend.repository.PassportRepository;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepository;

    public Passport findById(Long id) {
        return passportRepository.findById(id).orElse(null);
    }

    public Passport save(Passport passport) {
        return passportRepository.save(passport);
    }

    public void delete(Passport passport) {
        passport.setIsDeleted(true);
        passportRepository.save(passport);
    }
    
} 