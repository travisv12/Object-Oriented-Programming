package Week1.Orientation1_1.Task3;

public class CustomerTest {
    public static void main(String[] args) {
        // Create a new customer with a start time
        long start = System.currentTimeMillis();
        Customer customer1 = new Customer(start);

        // Simulate some processing time by pausing the program
        try {
            Thread.sleep(1000); // Wait 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the end time
        long end = System.currentTimeMillis();
        customer1.setEndTime(end);

        // Output the customer details and time spent
        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Start Time: " + customer1.getStartTime());
        System.out.println("End Time: " + customer1.getEndTime());
        System.out.println("Time Spent (ms): " + customer1.getTimeSpent());
    }
}
