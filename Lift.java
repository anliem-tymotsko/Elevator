package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Lift {
    private Direction direction;
    private static final int MAX_PEOPLE = 5;
    private int currentCount = 0;
    private LinkedList<Passenger> passengersInLift;
    private int currentFloor = 1;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public static int getMaxPeople() {
        return MAX_PEOPLE;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public LinkedList<Passenger> getPassengersInLift() {
        return passengersInLift;
    }

    public void setPassengersInLift(LinkedList<Passenger> passengersInLift) {
        this.passengersInLift = passengersInLift;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public LinkedList settingPeople(Queue<Passenger> passengers) {
        passengersInLift = passengers.stream().limit(MAX_PEOPLE - this.getCurrentCount())
                .filter(passenger -> passenger.getCurrentFloor() == currentFloor)
                .collect(Collectors.toCollection(LinkedList::new));
        passengers.removeAll(passengersInLift);
        return passengersInLift;
    }


}
