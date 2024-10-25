package Week1.Assignment2.Task3;

import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the weight in grams
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();

        // Conversion factors
        double gramsPerLuoti = 13.28;
        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;

        // Convert grams to total luoti
        double totalLuoti = grams / gramsPerLuoti;

        // Calculate leiviskä (integer division)
        int leiviska = (int) (totalLuoti / (luotiPerNaula * naulaPerLeiviska));

        // Calculate remaining luoti after converting to leiviskä
        double remainingLuotiAfterLeiviska = totalLuoti - (leiviska * luotiPerNaula * naulaPerLeiviska);

        // Calculate naula (integer division)
        int naula = (int) (remainingLuotiAfterLeiviska / luotiPerNaula);

        // Calculate remaining luoti after converting to naula
        double luoti = remainingLuotiAfterLeiviska - (naula * luotiPerNaula);

        // Display the result
        System.out.printf("%.2f grams is %d leiviskä, %d naula, and %.2f luoti.%n", grams, leiviska, naula, luoti);
    }
}
