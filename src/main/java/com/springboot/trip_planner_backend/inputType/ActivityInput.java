package com.springboot.trip_planner_backend.inputType;

import com.springboot.trip_planner_backend.entity.Accommodation;
import com.springboot.trip_planner_backend.entity.Destination;
import com.springboot.trip_planner_backend.entity.Transportation;

import lombok.Data;

@Data
public class ActivityInput {
    private String title;
    private String description;
    private Long tripId;
    private Destination destination;
    private Transportation transportation;
    private Accommodation accommodation;
    private String bookingReference;
    private String notes;
    private Float cost;
    private String startTime;
    private String endTime;
}