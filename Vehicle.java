

public abstract class Vehicle {
    String PlateNumber;
    Integer VinNumber;
    String color;
    Integer Price;
    Integer Combustion;
    Integer FuelLevel;
    Integer DistanceCounter;

    public Vehicle(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter) {
        PlateNumber = plateNumber;
        VinNumber = vinNumber;
        this.color = color;
        Price = price;
        Combustion = combustion;
        FuelLevel = fuelLevel;
        DistanceCounter = distanceCounter;
    }
}
