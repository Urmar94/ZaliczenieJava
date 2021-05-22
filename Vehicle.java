package com.company;

public abstract class Vehicle implements Active {
    String plateNumber;
    Integer vinNumber;
    String color;
    Integer price;
    Integer combustion;
    Integer fuelLevel;
    Integer distanceCounter;
    Integer maxFuelLevel;

    public Vehicle(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer maxFuelLevel) {
        this.plateNumber = plateNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.combustion = combustion;
        this.fuelLevel = fuelLevel;
        this.distanceCounter = distanceCounter;
        this.maxFuelLevel = maxFuelLevel;
    }

    @Override
    public void ride(int kilometer) {
        if(kilometer <= (this.fuelLevel/this.combustion)*100)
        {
            this.distanceCounter+=kilometer;
            this.fuelLevel=this.fuelLevel-this.combustion*kilometer/100;
            System.out.println("Aktualny poziom paliwa: " + this.fuelLevel);
            System.out.println("Aktualny stan licznika: " + this.distanceCounter);
        }
        else
        {System.out.println("Masz za mało paliwa!!! Zatankuj!!");
        }
    }

    @Override
    public void refueling(int fuel) {
        if (fuel < (this.maxFuelLevel - this.fuelLevel)) {
            this.fuelLevel += fuel;
            System.out.println("Aktualny poziom paliwa: " + this.fuelLevel);
        }
        else if(fuel == (this.maxFuelLevel - this.fuelLevel)){
            this.fuelLevel=this.maxFuelLevel;
            System.out.println("Zatankowałeś do pełna!");
        }
        else {
            int x = fuel-(this.maxFuelLevel-this.fuelLevel);
            this.fuelLevel=this.maxFuelLevel;
            System.out.println("Zatankowałeś: "+ x + " Zatankowałeś do pełna!");
        }
    }

    @Override
    public void distance() {
        if (this.fuelLevel>this.combustion)
            System.out.println("Starczy paliwa na:"+ ((this.fuelLevel/this.combustion)*100)+" km");
    }
}
