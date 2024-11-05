package Week2.Assignment4.Task1;

public class SportsCar extends Car {

    public SportsCar(String typeName, double gasolineTankCapacity, double topSpeed) {
        super(typeName, gasolineTankCapacity, topSpeed);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            setSpeed(Math.min(getTopSpeed(), getSpeed() + 20)); // Better acceleration
            setGasolineLevel(Math.max(0, getGasolineLevel() - 15)); // Higher gasoline consumption
        } else {
            setSpeed(0);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                setSpeed(Math.max(0, getSpeed() - amount * 2)); // Better deceleration
            setGasolineLevel(Math.max(0, getGasolineLevel() - 10)); // Higher gasoline consumption
        } else {
            setSpeed(0);
        }
    }
    public static void main(String[] args) {
        // Create an instance of SportsCar
        SportsCar sportsCar = new SportsCar("Ferrari", 60, 300);

        // Fill the gasoline tank
        sportsCar.fillTank();
        System.out.println("Gasoline level after filling the tank: " + sportsCar.getGasolineLevel());

        // Test acceleration
        sportsCar.accelerate();
        System.out.println("Speed after acceleration: " + sportsCar.getSpeed());
        System.out.println("Gasoline level after acceleration: " + sportsCar.getGasolineLevel());

        // Test deceleration
        sportsCar.decelerate(5);
        System.out.println("Speed after deceleration: " + sportsCar.getSpeed());
        System.out.println("Gasoline level after deceleration: " + sportsCar.getGasolineLevel());
    }
}