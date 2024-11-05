package Week2.Assignment4.Task2;

public class Bus extends Car {
    private int passengerCount;
    private int maxPassengers;

    public Bus(String typeName, double gasolineTankCapacity, double topSpeed, int maxPassengers) {
        super(typeName, gasolineTankCapacity, topSpeed);
        this.passengerCount = 0;
        this.maxPassengers = maxPassengers;
    }

    public void passengerEnter() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
            System.out.println("One passenger entered. Current passengers: " + passengerCount);
        } else {
            System.out.println("Bus is full. No more passengers can enter.");
        }
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("One passenger exited. Current passengers: " + passengerCount);
        } else {
            System.out.println("No passengers to exit.");
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public static void main(String[] args) {
        // Create an instance of Bus
        Bus bus = new Bus("City Bus", 100, 80, 1);

        // Fill the gasoline tank
        bus.fillTank();
        System.out.println("Gasoline level after filling the tank: " + bus.getGasolineLevel());

        // Test passenger enter and exit
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerExit();
        System.out.println("Current passengers: " + bus.getPassengerCount());
    }
}