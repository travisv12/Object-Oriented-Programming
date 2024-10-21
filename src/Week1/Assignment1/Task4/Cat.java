package Week1.Assignment1.Task4;

public class Cat {
    private String name;

    // Constructor to initialize the Cat object with a name
    public Cat(String name) {
        this.name = name;
    }

    // Method to simulate the cat meowing
    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create the first instance of the Cat class with the name "Whiskers"
        Cat cat1 = new Cat("Whiskers");

        // Create the second instance of the Cat class with the name "Rex"
        Cat cat2 = new Cat("Rex");

        // Calling the meow method as per the behavior required
        cat1.meow();  // The cat named Whiskers says: Meow!
        cat1.meow();  // The cat named Whiskers says: Meow!
        cat2.meow();  // The cat named Rex says: Meow!
        cat1.meow();  // The cat named Whiskers says: Meow!
    }
}
