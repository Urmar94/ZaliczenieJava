package com.company;

public class Car extends Vehicle implements Active {
    Integer numberOfDoors;

    public Car(String plateNumber, Integer vinNumber, String color, double price, Integer combustion, double fuelLevel, Integer distanceCounter, double maxFuelLevel, Integer numberOfDoors) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter, maxFuelLevel);
        this.numberOfDoors = numberOfDoors;
    }
}

