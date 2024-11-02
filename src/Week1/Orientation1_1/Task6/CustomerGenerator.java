package Week1.Orientation1_1.Task6;

class CustomerGenerator {
    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    // Generates a specified number of customers and adds them to the queue
    public void generateCustomers(int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            long currentTime = System.nanoTime();
            Customer customer = new Customer(currentTime);
            servicePoint.addToQueue(customer);
        }
    }
}