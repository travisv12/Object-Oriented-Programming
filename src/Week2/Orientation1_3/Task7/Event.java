package Week2.Orientation1_3.Task7;

public class Event implements Comparable<Event> {
    private String name;
    private int time;
    private EventType type;

    public Event(String name, int time, EventType type) {
        this.name = name;
        this.time = time;
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        return this.time - other.time; // Sorting by time in ascending order
    }

    @Override
    public String toString() {
        return type + " event: '" + name + "' at time: " + time;
    }
}