package Week3.Assignment2.Task3;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
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

    @Override
    public void charge() {
        System.out.println("Not possible to charge " + this.getClass().getSimpleName() + ".");
    }

    // Abstract method for vehicle-specific information
    @Override
    public abstract String getInfo();
}
