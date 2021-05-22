package com.company;

public class Truck extends Vehicle implements Active {
    Integer capacity;

    public Truck(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer capacity) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter);
        this.capacity = capacity;
    }

    @Override
    public void ride() {
        System.out.println("jedze!");
    }

    @Override
    public void refueling() {
        System.out.println("tankuje");
    }

    @Override
    public void distance() {
        if (this.fuelLevel>this.combustion)
            System.out.println("Starczy paliwa na:"+ ((this.fuelLevel/this.combustion)*100)+" km");
    }
}
