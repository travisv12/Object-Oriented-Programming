package Week2.Assignment2.Task2;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    // Using HashMap to store item names and their costs
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Method to add an item and its cost to the grocery list
    public void addItem(String item, double cost) {
        if (groceryList.containsKey(item)) {
            System.out.println("Item '" + item + "' is already in the list with a cost of " + groceryList.get(item));
        } else {
            groceryList.put(item, cost);
            System.out.println("Added '" + item + "' with a cost of $" + cost + " to the list.");
        }
    }

    // Method to remove an item from the grocery list
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removed '" + item + "' from the list.");
        } else {
            System.out.println("Item '" + item + "' is not in the list.");
        }
    }

    // Method to display all items and their costs in the grocery list
    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The list is currently empty.");
        } else {
            int i = 1;
            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                System.out.println(i + ". " + entry.getKey() + " - $" + entry.getValue());
                i++;
            }
        }
    }

    // Method to check if an item is in the grocery list
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Method to calculate the total cost of items in the grocery list
    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list
        manager.addItem("Apples", 1.99);
        manager.addItem("Milk", 2.49);
        manager.addItem("Bread", 1.50);

        // Displaying the grocery list
        System.out.println();
        manager.displayList();

        // Checking if a specific item is in the list
        String itemToCheck = "Milk";
        System.out.println("\nIs \"" + itemToCheck + "\" in the grocery list? " + manager.checkItem(itemToCheck));

        // Removing an item from the grocery list
        String itemToRemove = "Milk";
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list...");
        manager.removeItem(itemToRemove);

        // Displaying the updated grocery list
        System.out.println();
        manager.displayList();

        // Calculating the total cost of items in the list
        double totalCost = manager.calculateTotalCost();
        System.out.println("\nTotal cost of items in the grocery list: $" + totalCost);
    }
}
