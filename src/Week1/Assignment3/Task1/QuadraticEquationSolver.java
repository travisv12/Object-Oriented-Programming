package Week1.Assignment3.Task1;

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the coefficient b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the coefficient c: ");
        double c = Double.parseDouble(scanner.nextLine());

        // Calculate the discriminant (D = b^2 - 4ac)
        double discriminant = (b * b) - (4 * a * c);

        // Check if the discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The equation has two real roots: %.2f and %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            // One real root (double root)
            double root = -b / (2 * a);
            System.out.printf("The equation has one real root: %.2f%n", root);
        } else {
            // No real roots
            System.out.println("No real roots");
        }
    }
}
