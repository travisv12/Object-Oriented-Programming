package Week1.Assignment1.Task3;

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three integers
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        // Calculating sum, product, and average
        int sum = first + second + third;
        int product = first * second * third;

        // To ensure a precise average (double type), at least one operand must be a floating-point number.
        // This is why we cast sum to double before dividing.
        double average = (double) sum / 3;

        // Printing sum, product, and average
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The product of the numbers is " + product);
        System.out.println("The average of the numbers is " + average);
    }
}
