package Week1.Orientation1_1.Task6;

public class Customer {
    private static int idCounter = 1; // Counter for assigning unique IDs
    private int id;                   // Customer ID
    private long startTime;           // Start time of customer
    private long endTime;             // End time of customer
    private long serviceTime;

    // Constructor to initialize customer with a unique ID and start time
    public Customer(long startTime) {
        this.id = idCounter++;
        this.startTime = startTime;
        this.endTime = 0;
        this.serviceTime = 0;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for start time
    public long getStartTime() {
        return startTime;
    }

    // Setter for start time
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Getter for end time
    public long getEndTime() {
        return endTime;
    }

    // Setter for end time
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Method to calculate time spent by customer (endTime - startTime)
    public long getTimeSpent() {
        return endTime - startTime;
    }

    public long getServiceTime() {
        return serviceTime;
    }
    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }
    public long timeSpentInQueue() {
        return endTime - startTime;
    }
}
