package Week1.Orientation1_1.Task6;

import java.util.LinkedList;

class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime;
    private int customerCount;

    public ServicePoint() {
        this.queue = new LinkedList<>();
        this.totalServiceTime = 0;
        this.customerCount = 0;
    }
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

                customer.setServiceTime(serviceTime);
                totalServiceTime += serviceTime;
                customerCount++;

                System.out.println("Customer ID: " + customer.getId());
                System.out.println("Service Time: " + serviceTime + " nanoseconds");
                System.out.println("Response Time (Queue Time + Service Time): " +
                        customer.timeSpentInQueue() + " nanoseconds");
            }
        }
    }
    public double calculateAverageServiceTime() {
        return (double) totalServiceTime / customerCount;
    }
}