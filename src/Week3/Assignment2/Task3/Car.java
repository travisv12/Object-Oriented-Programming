package Week3.Assignment2.Task3;

public class Car extends AbstractVehicle {
    private String color;

    // Constructor for Car, passing fuel and color to the parent class
    public Car(String fuel, String color) {
        super(fuel);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Type: Car\nFuel: " + fuel + "\nColor: " + color;
    }
}
