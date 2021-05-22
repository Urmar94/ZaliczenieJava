public class Motocycle extends Vehicle {
    int MaxSpeed;

    public Motocycle(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, int maxSpeed) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter);
        MaxSpeed = maxSpeed;
    }
}
