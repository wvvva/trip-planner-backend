// package com.springboot.trip_planner_backend.inContextTest;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import com.springboot.trip_planner_backend.entity.Activity;
// import com.springboot.trip_planner_backend.entity.Trip;
// import com.springboot.trip_planner_backend.entity.User;
// import com.springboot.trip_planner_backend.service.ActivityService;
// import com.springboot.trip_planner_backend.service.TripService;
// import com.springboot.trip_planner_backend.service.UserService;

// @Component
// public class TestInitializer implements CommandLineRunner {

//     @Autowired
//     private UserService userService;

//     @Autowired
//     private TripService tripService;

//     @Autowired
//     private ActivityService activityService;

//     @Override
//     public void run(String... args) throws Exception {
//         System.out.println("TestInitializer");

//         User user = new User("vanessa@gmail.com", "vanessa", "123456");
//         userService.save(user);

//         Trip trip = new Trip("Trip 1", user);
//         tripService.save(trip);

//         Activity activity = new Activity("Activity 1", trip);
//         activityService.save(activity);

//         System.out.println(tripService.findById(trip.getId()).getActivities().get(0).getName());
//     }
// } 