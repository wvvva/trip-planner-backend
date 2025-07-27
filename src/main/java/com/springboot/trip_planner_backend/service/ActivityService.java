package com.springboot.trip_planner_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.trip_planner_backend.entity.Activity;
import com.springboot.trip_planner_backend.repository.ActivityRepository;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity findById(Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    public List<Activity> findByTripId(Long tripId) {
        return activityRepository.findByTripId(tripId);
    }

    public Activity save(Activity activity) {
        return activityRepository.save(activity);
    }

    public void delete(Activity activity) {
        activity.setIsDeleted(true);
        activityRepository.save(activity);
    }
} 