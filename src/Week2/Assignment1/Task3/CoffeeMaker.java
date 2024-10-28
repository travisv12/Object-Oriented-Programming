package Week2.Assignment1.Task3;

public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeType = "normal"; // Default coffee type
        this.coffeeAmount = 10; // Default coffee amount
    }

    public void pressOnOff() {
        this.isOn = !this.isOn; // Toggle the state
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setCoffeeType(String coffeeType) {
        if (isOn) {
            if (coffeeType.equals("normal") || coffeeType.equals("espresso")) {
                this.coffeeType = coffeeType;
            }
        }
    }

    public String getCoffeeType() {
        return this.coffeeType;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (isOn) {
            if (coffeeAmount >= 10 && coffeeAmount <= 80) {
                this.coffeeAmount = coffeeAmount;
            }
        }
    }

    public int getCoffeeAmount() {
        return this.coffeeAmount;
    }
}