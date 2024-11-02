package Week1.Orientation1_1.Task5;

import java.util.LinkedList;

class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    // Adds a customer to the queue
    public void addToQueue(Customer customer) {
        queue.addFirst(customer);
        System.out.println("Customer " + customer.getId() + " added to the queue.");
    }

    // Removes a customer from the queue (FIFO)
    public Customer removeFromQueue() {
        return queue.isEmpty() ? null : queue.removeLast();
    }

    // Serves customers by turns
    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            System.out.println("Serving customer " + customer.getId() + "...");
            if (customer != null) {
                long serviceStartTime = System.nanoTime();

                // Simulate service time
                int sleepTime = (int)(Math.random() * 3000) + 1000; // 1-3 seconds
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long serviceEndTime = System.nanoTime();
                customer.setEndTime(serviceEndTime);

                // Calculate and print waiting and response times
                long waitingTime = serviceStartTime - customer.getStartTime();
                long serviceTime = serviceEndTime - serviceStartTime;
                long responseTime = waitingTime + serviceTime;

                System.out.println("Customer " + customer.getId() + " served:");
                System.out.println(" - Waiting time (nanoseconds): " + waitingTime);
                System.out.println(" - Service time (nanoseconds): " + serviceTime);
                System.out.println(" - Response time (nanoseconds): " + responseTime);
            }
        }
    }
}