package Week1.Orientation1_1.Task6;

public class TestServicePoint {
    public static void main(String[] args) {
        final int NUMBER_OF_RUNS = 5; // Number of times to run the test
        final int NUMBER_OF_CUSTOMERS = 10; // Number of customers per run
        double totalAverageServiceTime = 0;

        for (int i = 0; i < NUMBER_OF_RUNS; i++) {
            System.out.println("Run " + (i + 1) + ":");
            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator(servicePoint);

            // Generate customers for this run
            generator.generateCustomers(NUMBER_OF_CUSTOMERS);
            servicePoint.serve();

            // Calculate and accumulate the average service time for this run
            double averageServiceTime = servicePoint.calculateAverageServiceTime();
            totalAverageServiceTime += averageServiceTime;
            System.out.println("Average Service Time for this run: " + averageServiceTime + " nanoseconds\n");
        }

        // Calculate the overall average service time across all runs
        double overallAverageServiceTime = totalAverageServiceTime / NUMBER_OF_RUNS;
        System.out.println("Overall Average Service Time over " + NUMBER_OF_RUNS + " runs: " + overallAverageServiceTime + " nanoseconds");
    }
}
