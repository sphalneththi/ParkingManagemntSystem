import java.time.LocalDateTime;
import java.time.Duration;

public class ParkingTicket {
    private Vehicle vehicle;
    private final LocalDateTime startTime;

    public ParkingTicket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.startTime = LocalDateTime.now();
    }

    // Getters
    @Override
    public String toString() {
        return "Ticket Info - " + vehicle + ", Start Time: " + startTime;
    }

    public int parkedTime(){
        return (int)Duration.between(startTime,LocalDateTime.now()).toMinutes();
    }

    public double pay() {
        if(parkedTime()/60 == 0){
            return vehicle.getHourlyRate();
        }
        else {
            if(parkedTime() % 60 == 0){
                return (parkedTime() / 60) * vehicle.getHourlyRate();
            }
            else {
                return ((parkedTime() / 60) + 1 ) * vehicle.getHourlyRate();
            }
        }

    }


}
