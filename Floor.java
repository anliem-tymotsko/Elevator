package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Floor {
    private int number;
    private Queue<Passenger> passengersUp = new PriorityQueue<>();
    private Queue<Passenger> passengersDown = new PriorityQueue<>();

    public Floor() {
    }

    public Floor(Queue<Passenger> passengersUp, Queue<Passenger> passengersDown) {
        this.passengersUp = passengersUp;
        this.passengersDown = passengersDown;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Queue<Passenger> getPassengersUp() {
        return passengersUp;
    }

    public void setPassengersUp(Queue<Passenger> passengersUp) {
        this.passengersUp = passengersUp;
    }

    public Queue<Passenger> getPassengersDown() {
        return passengersDown;
    }

    public void setPassengersDown(Queue<Passenger> passengersDown) {
        this.passengersDown = passengersDown;
    }


}
