package Week3.Assignment5.Task1;

public class Calculator {
    private int value;

    // Constructor to initialize the calculator
    public Calculator() {
        this.value = 0;
    }

    // Method to reset the calculator to zero
    public void reset() {
        this.value = 0;
    }

    // Method to add an integer to the calculator
    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        this.value += number;
    }

    // Method to return the current value of the calculator
    public int getValue() {
        return this.value;
    }

    // Temporary main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        System.out.println("Current value: " + calculator.getValue()); // Should print 15
        calculator.reset();
        System.out.println("Current value after reset: " + calculator.getValue()); // Should print 0
    }
}