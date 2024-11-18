package Week5.Assignment2.Task1;

public class Theater {
    private int availableSeats;

    public Theater(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    // Synchronized method to reserve tickets
    public synchronized void reserveTickets(int numSeats, int customerId) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            System.out.println("Customer " + customerId + " reserved " + numSeats + " tickets.");
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + numSeats + " tickets.");
        }
        System.out.println("Available seats left: " + availableSeats);
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}