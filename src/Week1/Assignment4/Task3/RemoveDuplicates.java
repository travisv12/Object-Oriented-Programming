package Week1.Assignment4.Task3;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create an array and prompt the user to enter the integers
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 3: Create a new array to store unique elements
        int[] uniqueArray = new int[size];
        int uniqueCount = 0;

        // Step 4: Iterate through the original array and add only unique elements to the new array
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the uniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Step 5: Print the resulting array without duplicates
        System.out.println("The array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
