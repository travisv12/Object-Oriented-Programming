package Week2.Assignment2.Task3;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    // HashMap to store items by their name for easier retrieval and cost calculations
    private HashMap<String, Item> groceryList = new HashMap<>();

    // Method to add an item with its name, cost, and category to the grocery list
    public void addItem(String item, double cost, String category) {
        if (groceryList.containsKey(item)) {
            System.out.println("Item '" + item + "' is already in the list with a cost of " + groceryList.get(item).cost + " in category '" + groceryList.get(item).category + "'");
        } else {
            groceryList.put(item, new Item(item, cost, category));
            System.out.println("Added '" + item + "' with a cost of $" + cost + " in category '" + category + "' to the list.");
        }
    }

    // Method to remove an item from the grocery list by its name
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
            for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
                Item item = entry.getValue();
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (Category: " + item.category + ")");
                i++;
            }
        }
    }

    // Method to check if an item exists in the grocery list by its name
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Method to calculate the total cost of all items in the grocery list
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : groceryList.values()) {
            totalCost += item.cost;
        }
        return totalCost;
    }

    // Method to display items based on a specified category
    public void displayByCategory(String category) {
        System.out.println("Items in category '" + category + "':");
        boolean found = false;
        int i = 1;
        for (Item item : groceryList.values()) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(i + ". " + item.name + " - $" + item.cost);
                i++;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list
        manager.addItem("Apples", 1.99, "Fruits");
        manager.addItem("Milk", 2.49, "Dairy");
        manager.addItem("Bread", 1.50, "Bakery");
        manager.addItem("Bananas", 1.20, "Fruits");

        // Displaying the grocery list
        System.out.println();
        manager.displayList();

        // Displaying items by category
        System.out.println();
        manager.displayByCategory("Fruits");

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
        String formattedTotalCost = String.format("%.2f", totalCost);
        System.out.println("\nTotal cost of items in the grocery list: $" + formattedTotalCost);
    }
}
