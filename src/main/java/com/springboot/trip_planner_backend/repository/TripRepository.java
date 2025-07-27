package com.springboot.trip_planner_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.trip_planner_backend.entity.Trip;

// Inherited from JpaRepository:
// findAll()
// findById(Long id)
// save(Trip trip)
// delete(Trip trip)	
// deleteById(Long id)	
// count()	
// existsById(Long id)

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByUserId(Long userId);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId ORDER BY t.createdAt DESC LIMIT :n")
    List<Trip> findNMostRecentByUserId(Long userId, int n);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId AND t.status = 'PLANNING'")
    List<Trip> findPlanningTripByUserId(Long userId);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId AND t.status = 'CONFIRMED'")
    List<Trip> findConfirmedTripByUserId(Long userId);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId AND t.status = 'IN_PROGRESS'")
    List<Trip> findInProgressTripByUserId(Long userId);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId AND t.status = 'COMPLETED'")
    List<Trip> findCompletedTripByUserId(Long userId);

    @Query("SELECT t FROM Trip t WHERE t.user.id = :userId AND t.status = 'CANCELLED'")
    List<Trip> findCancelledTripByUserId(Long userId);
} 