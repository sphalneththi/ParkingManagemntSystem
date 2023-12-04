public class Vehicle {
    private final String licensePlate;
    private double hourlyRate;
    private String type;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.type = "Other";
        this.hourlyRate = 150.00;
    }

    public Vehicle(String licensePlate,String type,double hourlyRate) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.hourlyRate = hourlyRate;
    }

    // Getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return "License Plate: " + licensePlate + ", Type: " + type + ", Hourly Rate: " + getHourlyRate();
    }
}
