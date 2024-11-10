package Week3.Assignment2.Task3;

public class Bus extends AbstractVehicle {
    private int capacity;

    // Constructor for Bus, passing fuel and color to the parent class
    public Bus(String fuel, int capacity) {
        super(fuel);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }
}
