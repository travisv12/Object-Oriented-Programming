package Week3.Assignment2.Task3;

public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String fuel, String color) {
        super(fuel);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricMotorcycle... ");
    }

    @Override
    public String getInfo() {
        return "Type: ElectricMotorcycle\nColor: " + color;
    }
}