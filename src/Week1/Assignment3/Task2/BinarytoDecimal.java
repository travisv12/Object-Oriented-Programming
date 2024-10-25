package Week1.Assignment3.Task2;

import java.util.Scanner;

public class BinarytoDecimal {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Initialize the decimal value to 0
        int decimalValue = 0;

        // Loop through each digit of the binary number from right to left
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            // Get the current bit from the right (starting from position 0)
            char bit = binaryString.charAt(length - 1 - i); // Rightmost bit is at length-1

            // Check if the bit is '0' or '1', else notify an invalid input
            if (bit == '0' || bit == '1') {
                // Convert the bit to integer (0 or 1) and multiply by 2^i (position)
                decimalValue += (bit - '0') * Math.pow(2, i);
            } else {
                System.out.println("Invalid binary input: The input must only contain 0s and 1s.");
                return;
            }
        }

        // Display the decimal equivalent
        System.out.println("The decimal equivalent is: " + decimalValue);
    }
}
