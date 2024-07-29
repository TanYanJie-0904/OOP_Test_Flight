public class Seat {
    private String seatID;
    private String seatNumber;
    private String seatClass;
    private Flight flight;
    private boolean availability;

    public Seat(String seatID, String seatNumber, String seatClass, Flight flight, boolean availability) {
        this.seatID = seatID;
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.flight = flight;
        this.availability = availability;
    }

    // Getters and Setters
    public String getSeatID() { return seatID; }
    public void setSeatID(String seatID) { this.seatID = seatID; }
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public String getSeatClass() { return seatClass; }
    public void setSeatClass(String seatClass) { this.seatClass = seatClass; }
    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailable() {
        return availability;
    }
}
