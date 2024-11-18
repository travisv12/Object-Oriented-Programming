package Week5.Assignment2.Task2;

public class ThreadSafeTest {
    public static void main(String[] args) {
        // Create a thread-safe list instance
        ThreadSafeArrayList<String> safeList = new ThreadSafeArrayList<>();

        // Create a few ListUpdater tasks (threads) for adding and removing elements
        Thread thread1 = new Thread(new ListUpdater(safeList, "add", "Apple"));
        Thread thread2 = new Thread(new ListUpdater(safeList, "add", "Banana"));
        Thread thread3 = new Thread(new ListUpdater(safeList, "remove", "Apple"));
        Thread thread4 = new Thread(new ListUpdater(safeList, "add", "Cherry"));
        Thread thread5 = new Thread(new ListUpdater(safeList, "remove", "Banana"));

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final print of the list
        System.out.println("Final List: ");
        safeList.printList();
    }
}