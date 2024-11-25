package Week5.Assignment5.model;

public class Pet {
    private double x, y; // Pet's current location
    private final double speed = 6; // Movement speed

    public Pet(double startX, double startY) {
        this.x = startX;
        this.y = startY;
    }

    // Method to move the pet towards a target location
    public void moveTowards(double targetX, double targetY) {
        double dx = targetX - x;
        double dy = targetY - y;
        double distance = Math.sqrt(dx * dx + dy * dy);

        if (distance <= speed) {
            // Stop when the pet reaches the target
            x = targetX;
            y = targetY;
        } else {
            // Normalize the direction and move
            x += (dx / distance) * speed;
            y += (dy / distance) * speed;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
