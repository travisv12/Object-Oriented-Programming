package Week2.Orientation1_3.Task2;

public class AgeDistribution {
    public static void main(String[] args) {
        final int iterations = 1000;
        // Age ranges with cumulative probabilities
        int[][] ageDistribution = {
                {16, 20},    // Cumulative 16% -> Age 20
                {34, 21},    // Cumulative 34% -> Age 21
                {52, 22},    // Cumulative 52% -> Age 22
                {68, 23},    // Cumulative 68% -> Age 23
                {82, 24},    // Cumulative 82% -> Age 24
                {89, 25},    // Cumulative 89% -> Age 25
                {94, 26},    // Cumulative 94% -> Age 26
                {96, 28},    // Cumulative 96% -> Age 28
                {98, 30},    // Cumulative 98% -> Age 30
                {100, 35}    // Cumulative 100% -> Age 35
        };

        // Initialize an array to count each age occurrence
        int[] ageCounts = new int[36];  // Assuming ages range from 20 to 35

// Generate 1000 ages
        for (int i = 0; i < iterations; i++) {
            int randomNumber = (int) (Math.random() * 100) + 1; // Random number between 1 and 100
            int age = 0;

            // Find the age corresponding to the random number
            for (int j = 0; j < ageDistribution.length; j++) {
                if (randomNumber <= ageDistribution[j][0]) {
                    age = ageDistribution[j][1];
                    break;
                }
            }

            // Increment the counter for the chosen age
            ageCounts[age]++;
        }

// Print the age distribution
        System.out.println("Age  Count  Percentage");
        for (int age = 20; age <= 35; age++) {
            if (ageCounts[age] > 0) {
                double percentage = (double) ageCounts[age] / 1000 * 100;
                System.out.printf("%-4d %-6d %-6.2f%%\n", age, ageCounts[age], percentage);
            }
        }
    }
}

