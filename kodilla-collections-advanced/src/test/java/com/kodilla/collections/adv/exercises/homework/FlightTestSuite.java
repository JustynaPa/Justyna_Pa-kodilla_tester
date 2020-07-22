package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTestSuite {

    @Test
    public void shouldGetDeparture(){
        //Given
        Flight flight = new Flight("Mexico", "Prague");
        //When
        String result = flight.getDeparture();
        //Then
        assertEquals(result, "Mexico");
    }
    @Test
    public void shouldGetArrival(){
        //Given
        Flight flight = new Flight("Amsterdam", "Copenhagen");
        //When
        String result = flight.getArrival();
        //Then
        assertEquals(result, "Copenhagen");
    }
}
