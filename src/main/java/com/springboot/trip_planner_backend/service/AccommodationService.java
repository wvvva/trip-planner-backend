package com.springboot.trip_planner_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Accommodation;
import com.springboot.trip_planner_backend.repository.AccommodationRepository;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationRepository accommodationRepository;

    public Accommodation findById(Long id) {
        return accommodationRepository.findById(id).orElse(null);
    }

    public Accommodation save(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    public void delete(Accommodation accommodation) {
        accommodation.setIsDeleted(true);
        accommodationRepository.save(accommodation);
    }
} 