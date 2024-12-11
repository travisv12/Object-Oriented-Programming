package Week8.Assignment2.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate mean using streams
        double mean = Arrays.stream(numbers)
                .average()
                .orElse(0.0); // Default value in case of empty array

        System.out.println("Mean: " + mean);
    }
}
