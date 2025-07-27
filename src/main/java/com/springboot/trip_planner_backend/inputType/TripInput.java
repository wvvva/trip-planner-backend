package com.springboot.trip_planner_backend.inputType;

import java.util.List;

import com.springboot.trip_planner_backend.entity.Activity;
import com.springboot.trip_planner_backend.entity.Persona;
import com.springboot.trip_planner_backend.entity.Trip.TripStatus;
import com.springboot.trip_planner_backend.entity.Trip.TripType;

import lombok.Data;

@Data
public class TripInput {
    private String title;
    private TripStatus status;
    private Float budget;
    private TripType type;
    private List<Persona> personas;
    private List<Activity> activities;
}