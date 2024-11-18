package Week5.Assignment1.Task1;

public class MultiThreadedNumberPrinting {
    private static volatile boolean isOddTurn = true; // Tracks whose turn it is

    public static void main(String[] args) {
        int range = 20; // Specify the range

        // Create the odd number thread
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= range; i += 2) {
                while (!isOddTurn);// Busy-wait until it's the odd thread's turn
                System.out.println("Odd Thread: " + i);
                isOddTurn = false; // Signal the even thread to proceed
            }
        });

        // Create the even number thread
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= range; i += 2) {
                while (isOddTurn);// Busy-wait until it's the even thread's turn
                System.out.println("Even Thread: " + i);
                isOddTurn = true; // Signal the odd thread to proceed
            }
        });

        // Start the threads
        oddThread.start();
        evenThread.start();

        try {
            // Wait for threads to finish
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}
