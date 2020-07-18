package com.company;

import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        Lift lift = new Lift();
        Floor floor = new Floor();
        int currentFloorOfLift = 1;
        int nextFloor;

        if (countPassengersInBuilding != 0) {
            lift.setDirection(Direction.UP);
        } else {
            System.out.println("THERE AREN`T passengers in the building");
        }

        floor.setPassengersDown(randomFloor(countFloorsInBuilding, countPassengersInBuilding).stream()
                .filter(passenger -> Objects.equals(passenger.getDirection(), Direction.DOWN))
                .collect(Collectors.toCollection(PriorityQueue::new)));

        floor.setPassengersUp(randomFloor(countFloorsInBuilding, countPassengersInBuilding).stream()
                .filter(passenger -> Objects.equals(passenger.getDirection(), Direction.UP))
                .collect(Collectors.toCollection(PriorityQueue::new)));


        while (!(floor.passengersUp.isEmpty() && floor.passengersDown.isEmpty())) {

            if (lift.getDirection() == Direction.UP) {
                lift.settingPeople(floor.getPassengersUp(), currentFloorOfLift);
                nextFloor = lift.getPassengersInLift().stream().max(p -> p.getComingFloor()).
                if (currentFloorOfLift == 5) {
                    lift.setDirection(Direction.DOWN);
                }
            }

        }

    }


}
