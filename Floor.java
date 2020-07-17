package com.company;

import java.util.Queue;

public class Floor {
    Queue<Passenger> passengersUp;
    Queue<Passenger> passengersDown;

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
