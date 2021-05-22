public class Car extends Vehicle {
    Integer NumberOfDoors;

    public Car(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer numberOfDoors) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter);
        NumberOfDoors = numberOfDoors;
    }
}

