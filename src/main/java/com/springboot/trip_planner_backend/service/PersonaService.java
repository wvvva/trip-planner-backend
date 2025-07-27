package com.springboot.trip_planner_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Persona;
import com.springboot.trip_planner_backend.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public List<Persona> findByUserId(Long userId) {
        return personaRepository.findByUserId(userId);
    }
    
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public void delete(Persona persona) {
        persona.setIsDeleted(true);
        personaRepository.save(persona);
    }
} 