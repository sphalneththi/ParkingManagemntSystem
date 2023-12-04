import java.util.Scanner;

public class ParkingManager {
    private ParkingLot parkingLot;
    private ParkingTicket ticket;

    public ParkingManager(int capacity) {
        parkingLot = new ParkingLot(capacity);
    }

    public void parkVehicle(Vehicle vehicle) {
        if (parkingLot.addVehicle(vehicle)) {
            ticket = new ParkingTicket(vehicle);
            System.out.println("Vehicle parked successfully!");
            System.out.println(ticket);
        } else {
            System.out.println("Parking lot is full. Vehicle cannot be parked.");
        }
    }

    public void removeVehicle(String licensePlate) {
        if (parkingLot. removeVehicle(licensePlate,ticket)) {
            System.out.println("Vehicle removed successfully!");
        } else {
            System.out.println("Vehicle not found in the parking lot.");
        }
    }

    public void displayParkingStatus() {
        parkingLot.displayStatus();
    }
}
