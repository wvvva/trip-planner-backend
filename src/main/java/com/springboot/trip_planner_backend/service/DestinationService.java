package com.springboot.trip_planner_backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Destination;
import com.springboot.trip_planner_backend.repository.DestinationRepository;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository destinationRepository;

    public Destination findById(Long id) {
        return destinationRepository.findById(id).orElse(null);
    }

    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }

    public void delete(Destination destination) {
        destination.setIsDeleted(true);
        destinationRepository.save(destination);
    }
} 