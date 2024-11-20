package Week5.Assignment2.Task2;

public class ThreadSafeTest {
    public static void main(String[] args) {
        ThreadSafeArrayList<String> threadSafeList = new ThreadSafeArrayList<>();

        // Runnable task to add elements
        Runnable addTask = () -> {
            for (int i = 0; i < 3; i++) {
                threadSafeList.add(Thread.currentThread().getName() + "-Item-" + (i+1));
            }
        };

        // Runnable task to remove elements
        Runnable removeTask = () -> {
            for (int i = 0; i < 2; i++) {
                threadSafeList.remove(Thread.currentThread().getName() + "-Item-" + (i+1));
            }
        };

        // Create multiple threads
        Thread t1 = new Thread(addTask, "Thread-1");
        Thread t2 = new Thread(addTask, "Thread-2");
        Thread t3 = new Thread(removeTask, "Thread-1");
        Thread t4 = new Thread(removeTask, "Thread-2");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final size of the list
        System.out.println("Final size of the list: " + threadSafeList.size());
        threadSafeList.printlist();
    }
}
