package com.company;

public abstract class Vehicle {
    String plateNumber;
    Integer vinNumber;
    String color;
    Integer price;
    Integer combustion;
    Integer fuelLevel;
    Integer distanceCounter;

    public Vehicle(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter) {
        this.plateNumber = plateNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.combustion = combustion;
        this.fuelLevel = fuelLevel;
        this.distanceCounter = distanceCounter;
    }

}
