package Week1.Orientation1_2.Task2;

public class Event implements Comparable<Event> {
    private String name;
    private int time;

    public Event(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Event other) {
        return this.time - other.time; // Sorting by time in ascending order
    }

    @Override
    public String toString() {
        return "Event: '" + name + "' at time: " + time;
    }
}