package Week2.Assignment4.Task4;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape with color " + color;
    }
}