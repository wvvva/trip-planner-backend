package com.springboot.trip_planner_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Visa;
import com.springboot.trip_planner_backend.repository.VisaRepository;

@Service
public class VisaService {
    @Autowired
    private VisaRepository visaRepository;

    public Visa findById(Long id) {
        return visaRepository.findById(id).orElse(null);
    }
    
    public Visa save(Visa visa) {
        return visaRepository.save(visa);
    }

    public void delete(Visa visa) {
        visa.setIsDeleted(true);
        visaRepository.save(visa);
    }
} 