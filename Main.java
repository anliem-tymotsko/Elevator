package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
    private static int MIN_FLOOR = 5;
    private static int MAX_FLOOR = 20;
    private static int MIN_PASSENGERS = 0;
    private static int MAX_PASSENGERS = 10;

    public static void main(String[] args) {

        int countFloorsInBuilding = UtilRandom.rand(MIN_FLOOR, MAX_FLOOR);
        int countPassengersInBuilding = UtilRandom.rand(MIN_PASSENGERS, MAX_PASSENGERS);
        Lift lift = new Lift();
        Floor floor = new Floor();
        int currentFloorOfLift = 1;

        floor.setPassengersDown(randomFloor(countFloorsInBuilding, countPassengersInBuilding).stream()
                .filter(passenger -> passenger.getDirection().equals(Direction.DOWN))
                .collect(Collectors.toCollection(PriorityQueue::new)));

        floor.setPassengersUp(randomFloor(countFloorsInBuilding, countPassengersInBuilding).stream()
                .filter(passenger -> passenger.getDirection().equals(Direction.UP))
                .collect(Collectors.toCollection(PriorityQueue::new)));

        if (countPassengersInBuilding == 0) {
            System.out.println("THERE AREN`T passengers in the building");
        } else {
            lift.setDirection(Direction.UP);
        }

        while (!(floor.passengersUp.isEmpty() && floor.passengersDown.isEmpty())) {

            if (lift.getDirection() == Direction.UP) {
               lift.settingPeople(floor.getPassengersUp(), currentFloorOfLift);
               currentFloorOfLift++;
               if(currentFloorOfLift == 5){
                   lift.setDirection(Direction.DOWN);
               }
            }

        }

    }

    static LinkedList<Passenger> randomFloor(int countFloorsInBuilding, int countPassengersInBuilding) {
        LinkedList<Passenger> passengerLinkedList = new LinkedList<>();
        for (int i = 0; i < countPassengersInBuilding; i++) {
            Passenger passenger = new Passenger();
            passenger.setCurrentFloor(UtilRandom.rand(1, countFloorsInBuilding));
            passenger.setComingFloor(UtilRandom.rand(1, countFloorsInBuilding));
            passengerLinkedList.add(i, passenger);
        }
        return passengerLinkedList;
    }


}
