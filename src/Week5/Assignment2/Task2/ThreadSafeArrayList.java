package Week5.Assignment2.Task2;

import java.util.ArrayList;

public class ThreadSafeArrayList<T> {
    private final ArrayList<T> list = new ArrayList<>();

    // Adds an element to the list
    public synchronized void add(T element) {
        list.add(element);
    }

    // Returns the size of the list
    public int size() {
        return list.size();
    }

    // Removes an element from the list (if it exists)
    public synchronized boolean remove(T element) {
        return list.remove(element);
    }

    public void printlist() {
        for (T element : list) {
            System.out.println(element);
        }
    }
}