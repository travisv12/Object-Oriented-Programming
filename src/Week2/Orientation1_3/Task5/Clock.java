package Week2.Orientation1_3.Task5;

public class Clock {
    // Step 1: Create a private static instance of the class
    private static Clock instance;

    // Step 2: A variable to hold the time
    private long time;

    // Step 3: Private constructor to prevent instantiation from other classes
    private Clock() {
        // Initialize time to 0 or any default value
        this.time = 0;
    }

    // Step 4: Public method to provide access to the Singleton instance
    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Step 5: Method to set the time
    public void setTime(long time) {
        this.time = time;
    }

    // Step 6: Method to retrieve the current time
    public long getTime() {
        return this.time;
    }
}
