package Week3.Assignment2.Task2;

public class Motorcycle extends AbstractVehicle {
    private String color;

    // Constructor for Motorcycle, passing fuel and color to the parent class
    public Motorcycle(String fuel, String color) {
        super(fuel);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}

