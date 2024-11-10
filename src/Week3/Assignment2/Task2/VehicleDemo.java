package Week3.Assignment2.Task2;

public class VehicleDemo {
    public static void main(String[] args) {
        // Create instances of Car, Motorcycle, and Bus
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);

        // Start and stop each vehicle
        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        System.out.println("Car Information:\n" + car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle Information:\n" + motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        System.out.println("Bus Information:\n" + bus.getInfo() + "\n");
    }
}
