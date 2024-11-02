package Week1.Orientation1_1.Task5;

public class ServiceSystemSimulation {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator customerGenerator = new CustomerGenerator(servicePoint);

        // Generate customers at the beginning
        int numberOfCustomers = 5;  // You can set this to any desired number
        customerGenerator.generateCustomers(numberOfCustomers);

        // Start serving customers
        servicePoint.serve();
    }
}