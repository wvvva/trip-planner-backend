package com.springboot.trip_planner_backend.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "passport")
@PrimaryKeyJoinColumn(name = "id")
public class Passport extends Document {
    
    @Column(name = "is_biometric")
    private Boolean isBiometric;
    
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;

    @OneToMany(mappedBy = "passport")
    private List<Visa> visas = new ArrayList<>();
    
    // Constructors
    public Passport() {
        super();
        this.isDeleted = false;
    }
    
    // Getters and Setters
    public Boolean getIsBiometric() {
        return isBiometric;
    }
    
    public void setIsBiometric(Boolean isBiometric) {
        this.isBiometric = isBiometric;
    }
    
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
