package Week2.Assignment2.Task5;

import java.util.HashMap;

// GroceryListManager to manage multiple ShoppingLists
public class GroceryListManager {
    private HashMap<String, ShoppingList> shoppingLists;

    public GroceryListManager() {
        shoppingLists = new HashMap<>();
    }

    public void createShoppingList(String listName) {
        if (shoppingLists.containsKey(listName)) {
            System.out.println("A shopping list with this name already exists.");
        } else {
            shoppingLists.put(listName, new ShoppingList(listName));
            System.out.println("Created a new shopping list: " + listName);
        }
    }

    public void addItemToShoppingList(String listName, String item, double cost, String category, int quantity) {
        ShoppingList shoppingList = shoppingLists.get(listName);
        if (shoppingList != null) {
            shoppingList.addItem(item, cost, category, quantity);
        } else {
            System.out.println("Shopping list '" + listName + "' does not exist.");
        }
    }

    public void removeItemFromShoppingList(String listName, String item) {
        ShoppingList shoppingList = shoppingLists.get(listName);
        if (shoppingList != null) {
            shoppingList.removeItem(item);
        } else {
            System.out.println("Shopping list '" + listName + "' does not exist.");
        }
    }

    public void displayShoppingList(String listName) {
        ShoppingList shoppingList = shoppingLists.get(listName);
        if (shoppingList != null) {
            shoppingList.displayList();
        } else {
            System.out.println("Shopping list '" + listName + "' does not exist.");
        }
    }

    public void displayAllShoppingLists() {
        System.out.println("All Shopping Lists:");
        if (shoppingLists.isEmpty()) {
            System.out.println("No shopping lists available.");
        } else {
            for (String listName : shoppingLists.keySet()) {
                displayShoppingList(listName);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Create shopping lists
        manager.createShoppingList("Backyard BBQ");
        manager.createShoppingList("Weekend Camping");

        // Add items to "Backyard BBQ" shopping list
        manager.addItemToShoppingList("Backyard BBQ", "Hot Dogs", 3.99, "Food", 10);
        manager.addItemToShoppingList("Backyard BBQ", "Charcoal", 5.99, "Supplies", 1);

        // Add items to "Weekend Camping" shopping list
        manager.addItemToShoppingList("Weekend Camping", "Tent", 49.99, "Gear", 1);
        manager.addItemToShoppingList("Weekend Camping", "Marshmallows", 2.49, "Food", 2);

        // Display a specific shopping list
        System.out.println();
        manager.displayShoppingList("Backyard BBQ");

        // Remove an item from "Backyard BBQ"
        System.out.println();
        manager.removeItemFromShoppingList("Backyard BBQ", "Charcoal");

        // Display all shopping lists
        System.out.println();
        manager.displayAllShoppingLists();
    }
}

