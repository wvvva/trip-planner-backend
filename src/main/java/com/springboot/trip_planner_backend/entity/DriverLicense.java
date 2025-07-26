package com.springboot.trip_planner_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "driver_license")
@PrimaryKeyJoinColumn(name = "id")
public class DriverLicense extends Document {

    @Column(nullable = false)
    private String type;

    @Column(name = "state")
    private String state;

    @Column(name = "is_teen", nullable = false)
    private Boolean isTeen = false;

    @Column(name = "is_id", nullable = false)
    private Boolean isId = true;

    // Constructors
    public DriverLicense() {
        super();
    }

    public DriverLicense(String type) {
        super();
        this.type = type;
        this.isTeen = false;
        this.isId = true;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getIsTeen() {
        return isTeen;
    }

    public void setIsTeen(Boolean isTeen) {
        this.isTeen = isTeen;
    }

    public Boolean getIsId() {
        return isId;
    }

    public void setIsId(Boolean isId) {
        this.isId = isId;
    }
}
