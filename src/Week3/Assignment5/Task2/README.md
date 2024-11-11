# Calculator Program

This program implements a simple `Calculator` class that can sum positive integers. The class provides methods to reset the calculator, add integers, and retrieve the current value. If a negative integer is added, an exception is thrown.

## Calculator Class

```java
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
```

## Explanation

The `Calculator` class is designed to perform basic arithmetic operations, specifically summing positive integers. Below is a detailed explanation of each part of the class:

- **Instance Variable:**
  - `private int value;`: This variable stores the current value of the calculator.

- **Constructor:**
  - `public Calculator()`: Initializes the value to `0` when a new `Calculator` object is created.

- **Methods:**
  - `public void reset()`: Resets the value to `0`.
  - `public void add(int number) throws IllegalArgumentException`: Adds a positive integer to the current value. If a negative integer is passed, it throws an `IllegalArgumentException`.
  - `public int getValue()`: Returns the current value of the calculator.

- **Main Method:**
  - `public static void main(String[] args)`: A temporary method to test the functionality of the `Calculator` class. It creates an instance of `Calculator`, adds two integers, prints the current value, resets the calculator, and prints the value again.

This class follows the Model-View-Controller (MVC) pattern, where it acts as the model, encapsulating the data and the logic to manipulate that data. The `main` method serves as a simple test to demonstrate the class's functionality.

## Using GitHub Copilot to Write Methods

1. **Write the method signature and let GitHub Copilot write the method body**:
    - For the `reset` method, I wrote the method signature `public void reset()` and GitHub Copilot suggested the body `this.value = 0;`.

2. **Write the method signature and the first line of the method body, and let GitHub Copilot write the rest**:
    - For the `add` method, I wrote the method signature `public void add(int number)` and the first line `if (number < 0) {`. GitHub Copilot completed the rest of the method body, including the exception handling and addition logic.

3. **Write a comment describing the method in English, letting GitHub Copilot write the method body based on the comment**:
    - For the `getValue` method, I wrote the comment `// Method to return the current value of the calculator`, and GitHub Copilot suggested the method body `return this.value;`.

## Evaluation of GitHub Copilot

1. **Benefits**:
    - **Speed**: GitHub Copilot significantly speeds up the coding process by suggesting complete method bodies and handling boilerplate code.
    - **Accuracy**: It provides accurate and context-aware suggestions, reducing the likelihood of syntax errors.
    - **Convenience**: It helps in writing repetitive code quickly, allowing developers to focus on more complex logic.

2. **Drawbacks**:
    - **Over-reliance**: Developers might become overly reliant on GitHub Copilot, potentially hindering their problem-solving skills.
    - **Context Limitations**: Sometimes, the suggestions might not fully align with the specific requirements or coding style of the project.
    - **Learning Curve**: There is a learning curve to effectively use GitHub Copilot and understand when to accept or modify its suggestions.

Overall, GitHub Copilot is a valuable tool that can enhance productivity and assist in writing code efficiently. However, it should be used as a complement to, rather than a replacement for, a developer's own skills and judgment.
