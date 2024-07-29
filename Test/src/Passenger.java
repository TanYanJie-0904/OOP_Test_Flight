import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Passenger {
    private String passengerID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private List<Reservation> reservations;

    public Passenger(String passengerID, String firstName, String lastName, String email, String phoneNumber) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }

    // Getters and Setters
    public String getPassengerID() { return passengerID; }
    public void setPassengerID(String passengerID) { this.passengerID = passengerID; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Reservation createReservation(Flight flight, Seat seat) {
        if (seat.isAvailable()) {
            seat.setAvailability(false); // Mark seat as reserved
            Reservation reservation = new Reservation(this, seat, flight);
            reservations.add(reservation);
            return reservation;
        } else {
            System.out.println("Seat is not available.");
            return null;
        }
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
}
