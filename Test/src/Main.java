public class Main {
    public static void main(String[] args) {
// Create a flight
        Flight flight = new Flight("AA123", "JFK", "LAX", "2024-08-01T10:00:00", "2024-08-01T13:00:00");

        // Create seats and add them to the flight
        Seat seat1 = new Seat("S1", "12A", "Economy", flight, true);
        Seat seat2 = new Seat("S2", "12B", "Economy", flight, true);
        Seat seat3 = new Seat("S3", "12C", "Business", flight, true);

        flight.addSeat(seat1);
        flight.addSeat(seat2);
        flight.addSeat(seat3);

        // Create a passenger
        Passenger passenger = new Passenger("P001", "John", "Doe", "john.doe@example.com", "1234567890");

        // Display available seats before reservation
        System.out.println("Available seats before reservation:");
        for (Seat seat : flight.findAvailableSeats()) {
            System.out.println("Seat Number: " + seat.getSeatNumber() + ", Class: " + seat.getSeatClass());
        }

        // Create a reservation
        Reservation reservation = passenger.createReservation(flight, seat1);

        if (reservation != null) {
            // Print reservation details
            System.out.println("\nReservation Details:");
            System.out.println("Reservation ID: " + reservation.getReservationID());
            System.out.println("Passenger: " + reservation.getPassenger().getFirstName() + " " + reservation.getPassenger().getLastName());
            System.out.println("Flight ID: " + reservation.getFlight().getFlightID());
            System.out.println("Seat Number: " + reservation.getSeat().getSeatNumber());
            System.out.println("Reservation DateTime: " + reservation.getReservationDateTime());
        }

        // Display available seats after reservation
        System.out.println("\nAvailable seats after reservation:");
        for (Seat seat : flight.findAvailableSeats()) {
            System.out.println("Seat Number: " + seat.getSeatNumber() + ", Class: " + seat.getSeatClass());
        }
    }
}