package Week5.Assignment2.Task1;

public class Customer implements Runnable {
    private static final int MAX_SEATS = 5; // Maximum number of seats a customer can reserve at once
    private Theater theater;
    private int customerId;
    private int requestedSeats;

    public Customer(Theater theater, int customerId, int requestedSeats) {
        this.theater = theater;
        this.customerId = customerId;
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run() {
        // Try to reserve the requested seats
        theater.reserveTickets(requestedSeats, customerId);
        }
    }

