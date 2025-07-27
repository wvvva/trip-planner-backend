package com.springboot.trip_planner_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Trip;
import com.springboot.trip_planner_backend.repository.TripRepository;

import jakarta.transaction.Transactional;

@Service
public class TripService {
    @Autowired
    private TripRepository tripRepository;

    @Transactional
    public Trip findById(Long id) {
        Trip trip = tripRepository.findById(id).orElse(null);
        if (trip != null) {
            trip.getActivities().size();
        }
        return trip;
    }

    public List<Trip> findNMostRecentByUserId(Long userId, int n) {
        return tripRepository.findNMostRecentByUserId(userId, n);
    }

    public List<Trip> findByUserId(Long userId) {
        return tripRepository.findByUserId(userId);
    }

    public List<Trip> findPlanningTripByUserId(Long userId) {
        return tripRepository.findPlanningTripByUserId(userId);
    }

    public List<Trip> findConfirmedTripByUserId(Long userId) {
        return tripRepository.findConfirmedTripByUserId(userId);
    }

    public List<Trip> findInProgressTripByUserId(Long userId) {
        return tripRepository.findInProgressTripByUserId(userId);
    }

    public List<Trip> findCompletedTripByUserId(Long userId) {
        return tripRepository.findCompletedTripByUserId(userId);
    }

    public List<Trip> findCancelledTripByUserId(Long userId) {
        return tripRepository.findCancelledTripByUserId(userId);
    }
    
    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }

    public void deleteTrip(Long id) {
        Trip trip = findById(id);
        if (trip != null) {
            tripRepository.delete(trip);
        }
    }
} 