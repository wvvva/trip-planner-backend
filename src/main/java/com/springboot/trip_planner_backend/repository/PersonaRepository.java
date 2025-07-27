package com.springboot.trip_planner_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.trip_planner_backend.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    List<Persona> findByUserId(Long userId);
    
} 