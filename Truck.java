package com.company;

public class Truck extends Vehicle implements Active {
    Integer capacity;

    public Truck(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer maxFuelLevel, Integer capacity) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter, maxFuelLevel);
        this.capacity = capacity;
    }

}
