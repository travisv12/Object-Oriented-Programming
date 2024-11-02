package Week1.Orientation1_1.Task4;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueueManager {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void enqueueCustomer() {
        long startTime = System.nanoTime();
        Customer newCustomer = new Customer(startTime);
        queue.addFirst(newCustomer);
        System.out.println("Customer " + newCustomer.getId() + " added to the queue.");
    }

    public void dequeueCustomer() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. No customer to dequeue.");
            return;
        }

        // Remove the last customer in the queue (FIFO)
        Customer dequeuedCustomer = queue.removeLast();
        long endTime = System.nanoTime();
        dequeuedCustomer.setEndTime(endTime);

        // Calculate and display the time spent in the queue
        long timeSpent = dequeuedCustomer.getTimeSpent();
        System.out.println("Customer " + dequeuedCustomer.getId() + " dequeued.");
        System.out.println("Time spent in queue (nanoseconds): " + timeSpent);
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current queue:");
            for (Customer customer : queue) {
                System.out.println("Customer ID: " + customer.getId());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerQueueManager queueManager = new CustomerQueueManager();
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Enqueue a new customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    queueManager.enqueueCustomer();
                    break;
                case 2:
                    queueManager.dequeueCustomer();
                    break;
                case 3:
                    queueManager.displayQueue();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
        scanner.close();
    }
}
