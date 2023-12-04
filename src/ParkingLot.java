import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Vehicle> vehicles;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        vehicles = new ArrayList<>();
    }

    public boolean isFull() {
        return vehicles.size() >= capacity;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (isFull()) {
            return false;
        }
        vehicles.add(vehicle);
        return true;
    }

    public boolean removeVehicle(String licensePlate, ParkingTicket ticket) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlate().equals(licensePlate)) {
                System.out.printf("Please pay Rs. %.2f\n",ticket.pay());
                return vehicles.remove(vehicle);
            }
        }
        return false;
    }

    public void displayStatus() {
        System.out.println("Parking Lot Status:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
