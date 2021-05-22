package com.company;

public abstract class Vehicle implements Active {
    String plateNumber;
    Integer vinNumber;
    String color;
    double price;
    Integer combustion;
    double fuelLevel;
    Integer distanceCounter;
    double maxFuelLevel;

    public Vehicle(String plateNumber, Integer vinNumber, String color, double price, Integer combustion, double fuelLevel, Integer distanceCounter, double maxFuelLevel) {
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
    public void ride(int distance) {
        double x=(this.fuelLevel/this.combustion)*100;
        if (distance <= x){
            this.distanceCounter +=distance;
            this.fuelLevel= this.fuelLevel- (distance*this.combustion/100);
            System.out.println("aktualna liczba km: "+ this.distanceCounter);
        }
        else{
            System.out.println("Zatankuj!!");
        }
    }

    @Override
    public void refueling(double fuel) {
        if (fuel <= this.maxFuelLevel-this.fuelLevel)
        {
            this.fuelLevel+=fuel;
            System.out.println("Aktualny poziom paliwa: " + this.fuelLevel);
        }
        else {
            double x= fuel-this.maxFuelLevel-this.fuelLevel;
            System.out.println("Zatankowałeś: " +x+ "masz pełn bak!");
        }
    }

    @Override
    public void distance() {
        if (this.fuelLevel>this.combustion)
            System.out.println("Starczy paliwa na:"+ ((this.fuelLevel/this.combustion)*100)+" km");
    }

    @Override
    public void NewColor(String color) {
    this.color=color;
    this.price=this.price*1.05;
    System.out.println("Aktualna wartość:"+ this.price +" i kolor:"+this.color);
    }
}
