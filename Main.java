package com.company;

public class Main {

    public static void main(String[] args) {
    Car car1 = new Car("GD 234234", 125678, "red", 10000, 10, 20, 4000, 60, 5);
    Car car2 = new Car("GD 23sd34", 12312, "green", 1000, 5, 10, 2000, 80, 5);

    Truck truck1 = new Truck("CAL2131", 411231, "black", 102935, 15, 60, 40000, 200, 450);
    Truck truck2 = new Truck("CAL2196", 4756751, "white", 101415,17, 100, 6000, 350, 500);

    Motrocycle moto1 = new Motrocycle("gd123", 1231441, "red", 123123, 8, 30, 1321, 30, 300);
    Motrocycle moto2 = new Motrocycle("gd122", 1222, "yellow", 12113, 9, 30, 132, 30, 300);

    car1.ride(100);
    truck1.refueling(20);
    car2.distance();
    car1.NewColor("green");
    }
}
