package Week5.Assignment1.Task2;

import java.util.Random;

public class ParallelNumberSummation {
    public static void main(String[] args) {
        int arraySize = 100000; // Size of the array
        int[] array = new int[arraySize];

        // Generate random numbers for the array
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0 and 99
        }

        // Get the number of available processor cores
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available cores: " + cores);

        // Calculate portion size
        int portionSize = arraySize / cores;
        SumTask[] threads = new SumTask[cores];

        // Start threads
        long startTime = System.nanoTime();
        for (int i = 0; i < cores; i++) {
            int start = i * portionSize;
            int end = (i == cores - 1) ? arraySize : (i + 1) * portionSize; // Handle remainder in the last portion

            threads[i] = new SumTask(array, start, end);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (SumTask thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sum all partial sums
        int totalSum = 0;
        for (SumTask thread : threads) {
            totalSum += thread.getPartialSum();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Print the results
        System.out.println("Sum: " + totalSum);
        System.out.println("Time taken: " + duration / 1_000_000 + " ms.");
    }
}