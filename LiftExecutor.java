package com.company;

import sun.misc.Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;

public class LiftExecutor {
    public void run() {
        Lift lift = new Lift();
        Map<Integer, Floor> allFloors = FloorUtils.generationAllFloors();
        int maxNeededFloor = 1;
        for (int i = 1; i <= allFloors.size(); i++) {
            if (maxNeededFloor < maxOnThisFloor) {
                maxNeededFloor = maxOnThisFloor;
            }
        }

    }

    private int findLastFloor(Map<Integer, Floor> allFloors) {
        allFloors.entrySet().stream().flatMap(floor ->{
            floor.getValue().getPassengersDown().addAll(floor.getValue().getPassengersUp());
            return floor.getValue().getPassengersDown();
        }).max(passenger -> passenger.))

    }
}
}
