package Week7.Assignment3.Task1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    private Color color;
    private boolean isCapOn;

    // Default constructor, sets the default color to RED
    public Pen() {
        this.color = Color.RED;
        this.isCapOn = true;
    }

    // Constructor with specified color
    public Pen(Color color) {
        this.color = color;
        this.isCapOn = true;
    }

    // Removes the cap
    public void capOff() {
        isCapOn = false;
    }

    // Places the cap back on
    public void capOn() {
        isCapOn = true;
    }

    // Attempts to draw
    public String draw() {
        return isCapOn ? "" : "Drawing " + color;
    }

    // Changes the color of the pen (only allowed if the cap is on)
    public void changeColor(Color newColor) {
        if (isCapOn) {
            this.color = newColor;
        }
    }
}
