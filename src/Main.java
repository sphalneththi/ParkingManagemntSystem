import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingManager parkingManager = new ParkingManager(10); // Set parking lot capacity

        boolean running = true;
        while (running) {
            System.out.println("\n------ Parking Management System ------");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Parking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the input

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter vehicle license plate: ");
                    String licensePlate = scanner.nextLine();
                    Vehicle vehicle;
                    switch (licensePlate.charAt(0)){
                        case 'C','E','3' -> vehicle = new Car(licensePlate);
                        case 'B' -> vehicle = new Bike(licensePlate);
                        case 'A','Q' -> vehicle = new ThreeWheel(licensePlate);
                        default -> vehicle = new Vehicle(licensePlate);
                    }
                    parkingManager.parkVehicle(vehicle);
                }
                case 2 -> {
                    System.out.print("Enter vehicle license plate: ");
                    String licensePlate = scanner.nextLine();
                    parkingManager.removeVehicle(licensePlate);
                }
                case 3 -> parkingManager.displayParkingStatus();
                case 4 -> {
                    running = false;
                    System.out.println("Exiting the program. Thank you!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
