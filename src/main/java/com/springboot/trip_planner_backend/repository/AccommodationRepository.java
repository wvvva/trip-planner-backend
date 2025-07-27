package com.springboot.trip_planner_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.trip_planner_backend.entity.Accommodation;

// Inherited from JpaRepository:
// findAll()
// findById(Long id)
// save(Trip trip)
// delete(Trip trip)	
// deleteById(Long id)	
// count()	
// existsById(Long id)

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    List<Accommodation> findByTripId(Long tripId);
    
} 