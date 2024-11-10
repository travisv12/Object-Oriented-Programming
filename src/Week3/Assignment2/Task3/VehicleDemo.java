package Week3.Assignment2.Task3;

public class VehicleDemo {
    public static void main(String[] args) {
        // Create instances of Car, Motorcycle, Bus, ElectricCar, and ElectricMotorcycle
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);
        ElectricCar electricCar = new ElectricCar("Electric","White");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Electric", "Blue");

        // Start and stop each vehicle
        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        car.charge();
        System.out.println("Car Information:\n" + car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println("Motorcycle Information:\n" + motorcycle.getInfo() + "\n");

        bus.start();
        bus.stop();
        bus.charge();
        System.out.println("Bus Information:\n" + bus.getInfo() + "\n");

        electricCar.start();
        electricCar.stop();
        electricCar.charge();
        System.out.println("ElectricCar Information:\n" + electricCar.getInfo() + "\n");

        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();
        System.out.println("ElectricMotorcycle Information:\n" + electricMotorcycle.getInfo() + "\n");
    }
}