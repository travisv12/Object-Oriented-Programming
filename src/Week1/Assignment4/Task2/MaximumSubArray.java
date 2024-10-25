package Week1.Assignment4.Task2;

import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create an array and prompt the user to enter the integers
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 3: Initialize the maxSum to the sum of the first element
        int maxSum = array[0];
        int start = 0;
        int end = 0;

        // Step 4: Find the subarray with the maximum sum
        // Iterate through all possible subarrays
        for (int i = 0; i < size; i++) {
            int currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += array[j];  // Calculate the sum of the subarray from i to j
                if (i == 0 && j == 0) {
                    // Initialize maxSum to the first subarray sum
                    maxSum = currentSum;
                }
                if (currentSum > maxSum) {
                    // Update maxSum and the corresponding indices
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        // Step 5: Print the maximum sum and the corresponding indices (1-based)
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
    }
}
