package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add( new Flight("Barcelona", "Warsaw"));
        flightList.add( new Flight("Vilnius", "Amsterdam"));
        flightList.add( new Flight("Mexico City", "Tokyo"));
        flightList.add( new Flight("Prague", "Warsaw"));
        return flightList;
    }
}

