import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightID;
    private String departureAirport;
    private String arrivalAirport;
    private String departureDateTime;
    private String arrivalDateTime;
    private List<Seat> seats;

    public Flight(String flightID, String departureAirport, String arrivalAirport, String departureDateTime, String arrivalDateTime) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seats = new ArrayList<>();
    }

    // Getters and Setters
    public String getFlightID() { return flightID; }
    public void setFlightID(String flightID) { this.flightID = flightID; }
    public String getDepartureAirport() { return departureAirport; }
    public void setDepartureAirport(String departureAirport) { this.departureAirport = departureAirport; }
    public String getArrivalAirport() { return arrivalAirport; }
    public void setArrivalAirport(String arrivalAirport) { this.arrivalAirport = arrivalAirport; }
    public String getDepartureDateTime() { return departureDateTime; }
    public void setDepartureDateTime(String departureDateTime) { this.departureDateTime = departureDateTime; }
    public String getArrivalDateTime() { return arrivalDateTime; }
    public void setArrivalDateTime(String arrivalDateTime) { this.arrivalDateTime = arrivalDateTime; }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public ArrayList<Seat> findAvailableSeats() {
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isAvailable()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
}
