package com.springboot.trip_planner_backend.inputType;

import java.util.List;

import com.springboot.trip_planner_backend.entity.Document;
import lombok.Data;

@Data
public class PersonaInput {
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String nationality;
    private String ethnicity;
    private String specialNeed;
    private String preference;
    private List<Document> documents;

    public PersonaInput(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}