package Week2.Assignment2.Task1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Method to add an item to the grocery list
    public void addItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Item '" + item + "' is already in the list.");
        } else {
            groceryList.add(item);
            System.out.println("Added '" + item + "' to the list.");
        }
    }

    // Method to remove an item from the grocery list
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removed '" + item + "' from the list.");
        } else {
            System.out.println("Item '" + item + "' is not in the list.");
        }
    }

    // Method to display all items in the grocery list
    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The list is currently empty.");
        } else {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }

    // Method to check if an item is in the grocery list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

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
    }
}
