package Week5.Assignment2.Task2;

import java.util.ArrayList;

public class ThreadSafeArrayList<T> {
    private final ArrayList<T> list;

    // Constructor
    public ThreadSafeArrayList() {
        this.list = new ArrayList<>();
    }

    public synchronized void ElementAction(String action, T element) {
        if ("add".equals(action)) {
            list.add(element);
            System.out.println("Added: " + element);
            System.out.println("Current size: " + list.size());
        } else if ("remove".equals(action)) {
            if (list.remove(element)) {
                System.out.println("Removed: " + element);
                System.out.println("Current size: " + list.size());
            } else {
                System.out.println("Failed to remove: " + element);
                System.out.println("Current size: " + list.size());
            }
        }
    }

    // Synchronized method to get the size of the list
    public int size() {
        return list.size();
    }

    // Synchronized method to print the list (for testing)
    public void printList() {
        System.out.println(list);
    }
}
