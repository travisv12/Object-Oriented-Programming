package Week2.Assignment1.Task4;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 80, 100);
        myCar.fillTank();

        myCar.setSpeed(50);

        // Test cruise control
        boolean cruiseControlOn = myCar.turnOnCruiseControl(35);
        if (cruiseControlOn) {
            System.out.println("Cruise control is on. Target speed: " + myCar.getCruiseControlTargetSpeed() + " km/h");
        } else {
            System.out.println("Failed to turn on cruise control.");
        }

        // Simulate driving
        for (int i = 0; i < 10; i++) {
            myCar.updateCruiseControl();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h, gas level: " + myCar.getGasolineLevel() + " liters");
        }

        // Turn off cruise control
        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is off.");
    }
}