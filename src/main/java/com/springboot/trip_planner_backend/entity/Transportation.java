package com.springboot.trip_planner_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transportation")
@PrimaryKeyJoinColumn(name = "id")
public class Transportation extends Activity{
    
    @Column(name = "number")
    private String number; // flight number, vehicle plate etc
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;
    
    // Constructors
    public Transportation() {
        super();
        this.isDeleted = false;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
