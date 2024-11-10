package Week3.Assignment2.Task4;

public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String fuel, String color) {
        super(fuel);
        this.color = color;
        this.fuelEfficiency = 0.1;
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