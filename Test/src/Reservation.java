import java.util.Random;

public class Reservation {
    private String reservationID;
    private Passenger passenger;
    private Seat seat;
    private Flight flight;
    private String reservationDateTime;

    public Reservation(Passenger passenger, Seat seat, Flight flight) {
        this.reservationID = generateRandomString(10); // Generate a random reservation ID
        this.passenger = passenger;
        this.seat = seat;
        this.flight = flight;
        this.reservationDateTime = java.time.LocalDateTime.now().toString();
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    // Getters and Setters
    public String getReservationID() { return reservationID; }
    public void setReservationID(String reservationID) { this.reservationID = reservationID; }
    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }
    public Seat getSeat() { return seat; }
    public void setSeat(Seat seat) { this.seat = seat; }
    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }
    public String getReservationDateTime() { return reservationDateTime; }
    public void setReservationDateTime(String reservationDateTime) { this.reservationDateTime = reservationDateTime; }
}
