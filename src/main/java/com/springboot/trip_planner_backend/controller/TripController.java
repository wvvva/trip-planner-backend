package com.springboot.trip_planner_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.springboot.trip_planner_backend.entity.Persona;
import com.springboot.trip_planner_backend.entity.Trip;
import com.springboot.trip_planner_backend.service.PersonaService;
import com.springboot.trip_planner_backend.service.TripService;

@Controller
public class TripController{

    @Autowired
    private TripService tripService;

    @QueryMapping
    public Trip getTrip(@Argument Long id) {
        return tripService.findById(id);
    }

    @QueryMapping
    public List<Trip> getNMostRecentTripByUserId(@Argument Long userId, @Argument int n) {
        return tripService.findNMostRecentByUserId(userId, n);
    }

    @QueryMapping
    public List<Trip> getAllTripsByUserId(@Argument Long userId) {
        return tripService.findByUserId(userId);
    }
    
}