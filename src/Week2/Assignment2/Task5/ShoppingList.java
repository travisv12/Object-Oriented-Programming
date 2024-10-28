package Week2.Assignment2.Task5;

import java.util.ArrayList;

public class ShoppingList {
    private String listName;
    private ArrayList<Week2.Assignment2.Task5.Item> items;

    public ShoppingList(String listName) {
        this.listName = listName;
        this.items = new ArrayList<>();
    }

    public String getListName() {
        return listName;
    }

    public void addItem(String name, double cost, String category, int quantity) {
        items.add(new Week2.Assignment2.Task5.Item(name, cost, category, quantity));
        System.out.println("Added '" + name + "' to the shopping list '" + listName + "'");
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.name.equals(name));
        System.out.println("Removed '" + name + "' from the shopping list '" + listName + "'");
    }

    public void displayList() {
        System.out.println("Shopping List: " + listName);
        if (items.isEmpty()) {
            System.out.println("This shopping list is empty.");
        } else {
            int i = 1;
            for (Item item : items) {
                System.out.println(i + ". " + item.name + " - $" + item.cost + " (Category: " + item.category + ", Quantity: " + item.quantity + ")");
                i++;
            }
        }
    }
}