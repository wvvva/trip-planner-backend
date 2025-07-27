package com.springboot.trip_planner_backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@AutoConfigureGraphQlTester
public class TripControllerTest {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    public void testCreateTrip() {
        Map<String, Object> tripInput = new HashMap<>();
        tripInput.put("title", "Test Trip");

        this.graphQlTester.document("""
            mutation($tripInput: TripInput!) {
                createTrip(tripInput: $tripInput) {
                    id
                    title
                }
            }
        """)
        .variable("tripInput", tripInput)
        .execute()
        .path("createTrip.title")
        .entity(String.class)
        .isEqualTo("Test Trip");
    }
}
