package Week3.Assignment3.Task1;

import java.io.*;
import java.net.*;

public class CSVReader {
    private final static String FILE_URL = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    public static void main(String[] args) {
        try {
            // Open the URL and create a BufferedReader to read the content
            URL url = new URL(FILE_URL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            double totalTemperature = 0.0;
            int count = 0;

            // Skip the header line
            reader.readLine();

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line into columns
                String[] columns = line.split(";");

                // Get the date (first column) and temperature (second column)
                String date = columns[0];
                String temperatureStr = columns[1];

                // Filter for the 1st of January 2023
                if (date.startsWith("01.01.2023")) {
                    try {
                        // Convert the temperature to a double (replace comma with dot if necessary)
                        double temperature = Double.parseDouble(temperatureStr.replace(',', '.'));
                        totalTemperature += temperature;
                        count++;
                    } catch (NumberFormatException e) {
                        // Handle the case where the temperature is not a valid number
                        System.err.println("Invalid temperature value: " + temperatureStr);
                    }
                }
            }

            // Close the reader
            reader.close();

            // Calculate and print the average temperature
            if (count > 0) {
                double averageTemperature = totalTemperature / count;
                System.out.println("Average temperature on 01.01.2023: " + averageTemperature + " °C");
            } else {
                System.out.println("No data found for 01.01.2023.");
            }

        } catch (IOException e) {
            // Handle network or file reading errors
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
