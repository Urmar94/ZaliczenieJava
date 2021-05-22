package com.company;

public class Motocycle extends Vehicle implements Active {
    int maxSpeed;

    public Motocycle(String plateNumber, Integer vinNumber, String color, double price, Integer combustion, double fuelLevel, Integer distanceCounter, double maxFuelLevel, int maxSpeed) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter, maxFuelLevel);
        this.maxSpeed = maxSpeed;
    }
}
