package com.company;

import java.util.ArrayList;
import java.util.List;

public class PassengerUtils {
    private static final int MIN_PASSENGERS = 0;
    private static final int MAX_PASSENGERS = 10;

    static List<Passenger> generationPassengersOnFloors(int countFloorsInBuilding) {
        int countPassengersInBuilding = UtilRandom.rand(MIN_PASSENGERS, MAX_PASSENGERS);
        List<Passenger> passengers = new ArrayList<>();
        for (int i = 0; i < countPassengersInBuilding; i++) {
            Passenger passenger = new Passenger(UtilRandom.rand(1, countFloorsInBuilding), UtilRandom.rand(1, countFloorsInBuilding));
            passengers.add(passenger);
        }
        return passengers;

    }
}
