package Week8.Assignment1.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // Step 2: Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "San Francisco"));
        people.add(new Person("Charlie", 22, "New York"));
        people.add(new Person("Diana", 27, "Los Angeles"));
        people.add(new Person("Eve", 35, "New York"));

        // Step 3: Sort by age
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        // Step 4: Filter by city
        people.removeIf(person -> !person.getCity().equals("New York"));
        System.out.println("\nFiltered by city (New York):");
        people.forEach(System.out::println);
    }
}