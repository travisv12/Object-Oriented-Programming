package Week2.Assignment2.Task4;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    // HashMap to store items by their name for easier retrieval and tracking
    private HashMap<String, Item> groceryList = new HashMap<>();

    // Method to add an item with name, cost, category, and quantity to the grocery list
    public void addItem(String item, double cost, String category, int quantity) {
        if (groceryList.containsKey(item)) {
            System.out.println("Item '" + item + "' is already in the list.");
        } else {
            groceryList.put(item, new Item(item, cost, category, quantity));
            System.out.println("Added '" + item + "' with a cost of $" + cost + " in category '" + category + "' and quantity " + quantity + " to the list.");
        }
    }

    // Method to update the quantity of an existing item in the grocery list
    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.get(item).quantity = newQuantity;
            System.out.println("Updated the quantity of '" + item + "' to " + newQuantity);
        } else {
            System.out.println("Item '" + item + "' is not in the list.");
        }
    }

    // Method to display all items in the grocery list with their quantities
    public void displayAvailableItems() {
        System.out.println("Available Items:");
        int i = 1;
        for (Item item : groceryList.values()) {
            if (item.quantity > 0) {
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (Category: " + item.category + ", Quantity: " + item.quantity + ")");
                i++;
            }
        }
        if (i == 1) {
            System.out.println("No items with a positive quantity available.");
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
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (Category: " + item.category + ", Quantity: " + item.quantity + ")");
                i++;
            }
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list
        manager.addItem("Apples", 1.99, "Fruits", 10);
        manager.addItem("Milk", 2.49, "Dairy", 5);
        manager.addItem("Bread", 1.50, "Bakery", 0);  // This item has zero quantity

        // Displaying all items
        System.out.println();
        manager.displayList();

        // Updating item quantity
        System.out.println();
        manager.updateQuantity("Milk", 3);

        // Displaying only items with positive quantity
        System.out.println();
        manager.displayAvailableItems();
    }
}
