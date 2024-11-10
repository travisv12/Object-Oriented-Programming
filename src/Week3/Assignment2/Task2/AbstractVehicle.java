package Week3.Assignment2.Task2;

public abstract class AbstractVehicle implements Vehicle {
    protected String fuel;

    // Constructor for common attributes (fuel and color)
    public AbstractVehicle(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " is stopping...");
    }

    // Abstract method for vehicle-specific information
    @Override
    public abstract String getInfo();
}
