package Week2.Assignment4.Task2;

public class Car {
    private double speed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private double topSpeed;
    private String typeName;
    private boolean cruiseControlOn;
    private double cruiseControlTargetSpeed;
    private static final double MIN_CRUISE_SPEED = 20;
    private static final double MAX_CRUISE_SPEED = 80;

    public Car(String typeName, double gasolineTankCapacity, double topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
        this.cruiseControlOn = false;
        this.cruiseControlTargetSpeed = 0;
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
            if (amount > 0)
                speed = Math.max(0, speed - amount);
            gasolineLevel = Math.max(0, gasolineLevel - 5);
        } else
            speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    public boolean turnOnCruiseControl(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED && gasolineLevel > 0) {
            cruiseControlOn = true;
            cruiseControlTargetSpeed = targetSpeed;
            return true;
        } else {
            cruiseControlOn = false;
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
        cruiseControlTargetSpeed = 0;
    }

    public double getCruiseControlTargetSpeed() {
        return cruiseControlTargetSpeed;
    }

    public void updateCruiseControl() {
        if (cruiseControlOn) {
            if (gasolineLevel <= 0 || cruiseControlTargetSpeed < MIN_CRUISE_SPEED || cruiseControlTargetSpeed > MAX_CRUISE_SPEED || cruiseControlTargetSpeed > topSpeed) {
                cruiseControlOn = false;
                speed = 0;
                System.out.println("Cruise control turned off due to insufficient gas or invalid target speed.");
            } else if (speed < cruiseControlTargetSpeed) {
                accelerate();
                speed = Math.min(speed, cruiseControlTargetSpeed);
            } else if (speed > cruiseControlTargetSpeed) {
                decelerate(10);
                speed = Math.max(speed, cruiseControlTargetSpeed);
            } else if (speed == cruiseControlTargetSpeed) {
                gasolineLevel = Math.max(0, gasolineLevel - 5);
            }
        }
    }
}