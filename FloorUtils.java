package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class FloorUtils {
    private static final int MIN_FLOOR = 5;
    private static final int MAX_FLOOR = 20;

    public static Map<Integer, Floor> generationAllFloors() {

        Map<Integer, Floor> floors = new HashMap<>();
        int countFloorsInBuilding = UtilRandom.rand(MIN_FLOOR, MAX_FLOOR);
        List<Passenger> allPassengers = PassengerUtils.generationPassengersOnFloors(countFloorsInBuilding);
        for (int i = 1; i <= countFloorsInBuilding; i++) {
            floors.put(i, new Floor(checkFloor(allPassengers, i, Direction.UP), checkFloor(allPassengers, i, Direction.DOWN)));
        }
        return floors;
    }

    private static Queue<Passenger> checkFloor(List<Passenger> passengers, int numberOfCurrentFloor, Direction direction) {
        List<Passenger> passengersInSuchFloor = passengers.stream()
                .filter(passenger -> Objects.equals(passenger.getCurrentFloor(), numberOfCurrentFloor))
                .collect(Collectors.toList());
        return passengersInSuchFloor.stream().filter(passenger -> Objects.equals(passenger.getDirection(), direction))
                .collect(Collectors.toCollection(PriorityQueue::new));
    }
}
