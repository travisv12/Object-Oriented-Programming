package Week5.Assignment2.Task1;

public class TicketReservationSystem {
    public static void main(String[] args) {
        Theater theater = new Theater(20); // Theater with 20 seats
        Thread[] customers = new Thread[15];

        // Create and start customer threads
        for (int i = 0; i < 15; i++) {
            int requestedSeats = (int) (Math.random() * 4) + 1; // Randomly select between 1 to 4 tickets
            customers[i] = new Thread(new Customer(theater, i + 1, requestedSeats));
            customers[i].start();
        }

        // Wait for all customer threads to finish
        for (int i = 0; i < 15; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}