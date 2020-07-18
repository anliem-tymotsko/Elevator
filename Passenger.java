package com.company;

public class Passenger {
    private int currentFloor;
    private int comingFloor;
    private Direction direction;

    public Passenger() {
    }

    public Passenger(int currentFloor, int comingFloor) {
        this.currentFloor = currentFloor;
        this.comingFloor = comingFloor;
        setDirection(currentFloor < comingFloor ? Direction.UP : Direction.DOWN);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getComingFloor() {
        if (this.comingFloor > this.currentFloor) {
            setDirection(Direction.UP);
        } else {
            setDirection(Direction.DOWN);
        }
        return comingFloor;
    }

    public void setComingFloor(int comingFloor) {
        this.comingFloor = comingFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
