package com.company;

public class Motocycle extends Vehicle implements Active {
    int maxSpeed;

    public Motocycle(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer maxFuelLevel, int maxSpeed) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter, maxFuelLevel);
        this.maxSpeed = maxSpeed;
    }

}
