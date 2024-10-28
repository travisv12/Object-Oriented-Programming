package Week2.Assignment1.Task3;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.pressOnOff();
        System.out.println("Coffee maker is " + (myCoffeeMaker.isOn() ? "on" : "off"));

        myCoffeeMaker.setCoffeeType("espresso");
        myCoffeeMaker.setCoffeeAmount(50);

        System.out.println("Coffee type is " + myCoffeeMaker.getCoffeeType());
        System.out.println("Coffee amount is " + myCoffeeMaker.getCoffeeAmount() + " ml");

        myCoffeeMaker.pressOnOff();
        System.out.println("Coffee maker is " + (myCoffeeMaker.isOn() ? "on" : "off"));
    }
}