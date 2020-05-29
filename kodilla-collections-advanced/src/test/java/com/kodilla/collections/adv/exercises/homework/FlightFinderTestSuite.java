package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testfindFlightsFrom() {
        // Given
        FlightFinder testFrom = new FlightFinder();
        // When
        List<Flight> resultFrom = testFrom.findFlightsFrom("Barcelona");
        // Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Barcelona", "Warsaw"));
        assertEquals(expectedList, resultFrom);
    }

    @Test
    public void testfindFlightsTo() {
        // Given
        FlightFinder testTo = new FlightFinder();
        // When
        List<Flight> resultTo = testTo.findFlightsTo("Tokyo");
        // Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Mexico City", "Tokyo"));
        assertEquals(expectedList, resultTo);
    }

}