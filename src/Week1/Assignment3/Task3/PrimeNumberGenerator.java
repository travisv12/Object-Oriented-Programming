package Week1.Assignment3.Task3;

import java.util.Scanner;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the start value (positive integer): ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the end value (positive integer): ");
        int end = Integer.parseInt(scanner.nextLine());

        // Check if start is less than end
        if (start < 2) {
            start = 2; // The smallest prime number is 2, so adjust start if necessary
        }

        if (start > end) {
            System.out.println("Invalid range: start must be less than end.");
            return;
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Generate prime numbers between start and end
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A prime number is only divisible by 1 and itself, so we check divisibility
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Only check up to the square root of num
            if (num % i == 0) {
                return false; // If num is divisible by any number other than 1 or itself, it's not prime
            }
        }
        return true; // If no divisors found, num is prime
    }
}
