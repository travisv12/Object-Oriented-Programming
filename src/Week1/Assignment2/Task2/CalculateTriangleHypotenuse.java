package Week1.Assignment2.Task2;

import java.util.Scanner;

public class CalculateTriangleHypotenuse {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the lengths of the two legs of the triangle
        System.out.print("Enter the length of the first leg: ");
        double leg1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the length of the second leg: ");
        double leg2 = Double.parseDouble(scanner.nextLine());

        // Calculate the length of the hypotenuse using the Pythagorean theorem
        double hypotenuse = Math.sqrt((leg1 * leg1) + (leg2 * leg2));

        // Display the result
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuse);
    }
}