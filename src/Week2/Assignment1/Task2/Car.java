package Week2.Assignment1.Task2;

public class Car {
    private double speed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private double topSpeed;
    private String typeName;

    public Car(String typeName, double gasolineTankCapacity, double topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed = Math.min(topSpeed, speed + 10);
            gasolineLevel = Math.max(0, gasolineLevel - 10);
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - amount);
                gasolineLevel = Math.max(0, gasolineLevel - 5);
            }
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}