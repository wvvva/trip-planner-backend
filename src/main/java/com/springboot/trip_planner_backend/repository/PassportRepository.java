package com.springboot.trip_planner_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.trip_planner_backend.entity.Passport;

// Inherited from JpaRepository:
// findAll()
// findById(Long id)
// save(Trip trip)
// delete(Trip trip)	
// deleteById(Long id)	
// count()	
// existsById(Long id)

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {
} 