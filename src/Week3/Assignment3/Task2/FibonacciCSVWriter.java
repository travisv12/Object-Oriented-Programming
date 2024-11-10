package Week3.Assignment3.Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.math.BigInteger;

public class FibonacciCSVWriter {
    public static void main(String[] args) {
        // Specify the file name for the CSV
        String filename = "fibonacci_sequence.csv";

        // Generate the Fibonacci sequence
        BigInteger[] fibonacciSequence = generateFibonacci(100);

        // Write the sequence to a CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write the header for the CSV
            writer.write("Index;Fibonacci Number");
            writer.newLine();

            // Write each Fibonacci number to the CSV file with index and sequence in separate columns
            for (int i = 0; i < fibonacciSequence.length; i++) {
                writer.write((i + 1) + ";" + fibonacciSequence[i].toString());
                writer.newLine();
            }

            System.out.println("Fibonacci sequence written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing the CSV file: " + e.getMessage());
        }
    }

    // Function to generate Fibonacci sequence using BigInteger
    public static BigInteger[] generateFibonacci(int n) {
        BigInteger[] fibonacci = new BigInteger[n];
        fibonacci[0] = BigInteger.ZERO;  // The first Fibonacci number is 0
        if (n > 1) {
            fibonacci[1] = BigInteger.ONE;  // The second Fibonacci number is 1
        }

        // Generate the Fibonacci sequence for the rest of the numbers
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
        }

        return fibonacci;
    }
}
