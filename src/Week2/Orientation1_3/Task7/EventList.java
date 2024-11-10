package Week2.Orientation1_3.Task7;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll(); // Retrieve and remove the next event
    }

    public void printEvents() {
        // To print in order without modifying the queue, copy to an array and sort
        Event[] eventsArray = eventQueue.toArray(new Event[0]);
        java.util.Arrays.sort(eventsArray);

        for (Event event : eventsArray) {
            System.out.println(event);
        }
    }
}