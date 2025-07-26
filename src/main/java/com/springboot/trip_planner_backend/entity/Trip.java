package com.springboot.trip_planner_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trip")
public class Trip {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @Column(nullable = false)
    private String title;
    
    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "trip_status")
    private TripStatus status;

    public enum TripStatus {
        PLANNING,
        CONFIRMED,
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }
    
    @Column(name = "budget")
    private Float budget;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private TripType type; 

    public enum TripType {
        BUSINESS,
        LEISURE,
        FAMILY,
        OTHER
    }
    
    @Column(name = "start_date")
    private LocalDate startDate;
    
    @Column(name = "end_date")
    private LocalDate endDate;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // TODO: shared trips
    // @Column(name = "is_shared", nullable = false)
    // private Boolean isShared = false;
    
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;
    
    @ManyToMany()
    @JoinTable(
        name = "trip_persona",
        joinColumns = @JoinColumn(name = "trip_id"),
        inverseJoinColumns = @JoinColumn(name = "persona_id")
    )
    private List<Persona> personas = new ArrayList<>();
    
    @OneToMany(mappedBy = "trip")
    private List<Destination> destinations = new ArrayList<>();
    
    @OneToMany(mappedBy = "trip")
    private List<Activity> activities = new ArrayList<>();
    
    // Constructors
    public Trip() {}
    
    public Trip(String title, User user) {
        this.title = title;
        this.user = user;

        this.status = TripStatus.PLANNING;
        this.type = TripType.OTHER;

        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        
        this.isDeleted = false;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public TripStatus getStatus() {
        return status;
    }
    
    public void setStatus(TripStatus status) {
        this.status = status;
    }
    
    public Float getBudget() {
        return budget;
    }
    
    public void setBudget(Float budget) {
        this.budget = budget;
    }
    
    public TripType getType() {
        return type;
    }
    
    public void setType(TripType type) {
        this.type = type;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
    public LocalDate getEndDate() {
        return endDate;
    }
    
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }
    
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public List<Destination> getDestinations() {
        return destinations;
    }
    
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }
    
    public List<Activity> getActivities() {
        return activities;
    }
    
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
    
    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
    
} 