package Week2.Assignment4.Task3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 8.0)
        };

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }
    }
}