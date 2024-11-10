package Week3.Assignment2.Task3;

public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String fuel, String color) {
        super(fuel);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricCar... ");
    }

    @Override
    public String getInfo() {
        return "Type: ElectricCar\nColor: " + color;
    }
}