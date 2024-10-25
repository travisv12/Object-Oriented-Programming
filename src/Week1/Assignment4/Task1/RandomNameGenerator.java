package Week1.Assignment4.Task1;

import java.util.Random;
import java.util.Scanner;

public class RandomNameGenerator {

    public static void main(String[] args) {
        // Arrays containing first and last names
        String[] firstNames = {"Matti", "Emmi", "Mikael", "Olli", "Jarmo", "Sofia", "Daniel", "Ava", "Ville", "Ismo", "Mikko"};
        String[] lastNames = {"Salonen", "Järvinen", "Ahola", "Joninen", "Virtanen", "Eskola","Jokila", "Nieminen", "Koskinen"};

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many random names to generate
        System.out.print("How many random names would you like to generate? ");
        int numberOfNames = scanner.nextInt();

        // Create a Random object for generating random indices
        Random random = new Random();

        System.out.println("Generated Random Names:");

        // Generate the specified number of random names
        for (int i = 0; i < numberOfNames; i++) {
            // Choose random indices for first and last names
            int firstNameIndex = random.nextInt(firstNames.length);
            int lastNameIndex = random.nextInt(lastNames.length);

            // Generate and print the full name
            String fullName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
            System.out.println(fullName);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
