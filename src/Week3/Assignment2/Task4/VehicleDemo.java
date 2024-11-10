package Week3.Assignment2.Task4;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);
        ElectricCar electricCar = new ElectricCar("Electric", "White");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Electric", "Blue");

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        car.charge();
        System.out.println("Car Information:\n" + car.getInfo());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles per gallon\n");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println("Motorcycle Information:\n" + motorcycle.getInfo());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " miles per gallon\n");

        bus.start();
        bus.stop();
        bus.charge();
        System.out.println("Bus Information:\n" + bus.getInfo());
        System.out.println("Fuel Efficiency: " + bus.calculateFuelEfficiency() + " miles per gallon\n");

        electricCar.start();
        electricCar.stop();
        electricCar.charge();
        System.out.println("ElectricCar Information:\n" + electricCar.getInfo());
        System.out.println("Fuel Efficiency: " + electricCar.calculateFuelEfficiency() + " kWh per kilometer\n");

        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge();
        System.out.println("ElectricMotorcycle Information:\n" + electricMotorcycle.getInfo());
        System.out.println("Fuel Efficiency: " + electricMotorcycle.calculateFuelEfficiency() + " kWh per kilometer\n");
    }
}