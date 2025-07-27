package com.springboot.trip_planner_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Transportation;
import com.springboot.trip_planner_backend.repository.TransportationRepository;

@Service
public class TransportationService {
    @Autowired
    private TransportationRepository transportationRepository;

    public Transportation findById(Long id) {
        return transportationRepository.findById(id).orElse(null);
    }
    
    public Transportation save(Transportation transportation) {
        return transportationRepository.save(transportation);
    }

    // public void delete(Transportation transportation) {
    //     transportation.setIsDeleted(true);
    //     transportationRepository.save(transportation);
    // }
} 