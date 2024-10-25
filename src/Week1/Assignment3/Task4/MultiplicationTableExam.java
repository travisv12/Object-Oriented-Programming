package Week1.Assignment3.Task4;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score;

        // The loop continues until the user scores 10 points
        do {
            score = 0; // Reset the score for each set of problems

            // Generate 10 random multiplication problems
            for (int i = 0; i < 10; i++) {
                // Generate two random integers between 1 and 10
                int factor1 = random.nextInt(10) + 1;
                int factor2 = random.nextInt(10) + 1;

                // Present the problem to the user
                System.out.print("What is " + factor1 + " * " + factor2 + "? ");
                int userAnswer = scanner.nextInt();

                // Check the user's answer
                int correctAnswer = factor1 * factor2;
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++; // Increase the score if the answer is correct
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            }

            // After 10 questions, check if the user scored 10 points
            if (score == 10) {
                System.out.println("Congratulations! You've mastered the multiplication tables.");
            } else {
                System.out.println("You scored " + score + " out of 10. Try again!");
            }

        } while (score < 10); // Continue the loop if the score is less than 10
    }
}
