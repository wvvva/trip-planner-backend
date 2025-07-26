package com.springboot.trip_planner_backend.entity;

import jakarta.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Accommodation extends Activity{
    
    @Column(name = "has_breakfast")
    private Boolean hasBreakfast;
    
    @Column(name = "has_shuttle")
    private Boolean hasShuttle;
    
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;
    
    // Constructors
    public Accommodation() {
        super();
        this.isDeleted = false;
    }
    
    // Getters and Setters
    public Boolean getHasBreakfast() {
        return hasBreakfast;
    }
    
    public void setHasBreakfast(Boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }
    
    public Boolean getHasShuttle() {
        return hasShuttle;
    }
    
    public void setHasShuttle(Boolean hasShuttle) {
        this.hasShuttle = hasShuttle;
    }
    
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
