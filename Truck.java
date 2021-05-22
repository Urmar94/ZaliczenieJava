public class Truck extends Vehicle {
    Integer Capacity;

    public Truck(String plateNumber, Integer vinNumber, String color, Integer price, Integer combustion, Integer fuelLevel, Integer distanceCounter, Integer capacity) {
        super(plateNumber, vinNumber, color, price, combustion, fuelLevel, distanceCounter);
        Capacity = capacity;
    }
}
