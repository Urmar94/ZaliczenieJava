package com.company;

public class Truck extends Vehicle implements Active {
    Integer capacity;

    public Truck(String plateNumber, Integer vinNumber, String color, double price, Integer combustion, double fuelLevel, Integer distanceCounter, double maxFuelLevel, Integer capacity) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter, maxFuelLevel);
        this.capacity = capacity;
    }
}
