package Week2.Orientation1_3.Task7;

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
                long serviceStartTime = Clock.getInstance().getTime();

                Clock.getInstance().setTime(Clock.getInstance().getTime() + 5);

                long serviceEndTime = Clock.getInstance().getTime();
                customer.setEndTime(serviceEndTime);

                // Calculate and print waiting and response times
                long waitingTime = serviceStartTime - customer.getStartTime();

                System.out.println("Customer " + customer.getId() + " served:");
                System.out.println(" - Waiting time: " + waitingTime);
                System.out.println(" - Customer left at: " + Clock.getInstance().getTime());
            }
        }
    }
}