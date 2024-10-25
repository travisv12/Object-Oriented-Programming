package Week1.Assignment2.Task1;

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result rounded to one decimal place
        System.out.printf("The temperature in Celsius is: %.1f%n", celsius);
    }
}
