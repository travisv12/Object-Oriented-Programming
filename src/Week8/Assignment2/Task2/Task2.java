package Week8.Assignment2.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Perform filtering, transforming, and summing
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0) // Step 1: Filter out even numbers
                .map(n -> n * 2)         // Step 2: Double each remaining number
                .mapToInt(Integer::intValue) // Convert Integer to int for summing
                .sum();                  // Step 3: Find the sum

        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}
