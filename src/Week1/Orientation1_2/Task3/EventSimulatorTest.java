package Week1.Orientation1_2.Task3;

public class EventSimulatorTest {
    public static void main(String[] args) {
        // Create an EventList and add events with different types
        EventList eventList = new EventList();
        eventList.addEvent(new Event("Event 2", 2, EventType.Arrival));
        eventList.addEvent(new Event("Event 4", 3, EventType.Exit));
        eventList.addEvent(new Event("Event 1", 5, EventType.Arrival));
        eventList.addEvent(new Event("Event 3", 8, EventType.Exit));

        // Print events in the list ordered by time and type
        System.out.println("Events in chronological order:");
        eventList.printEvents();

        // Process events by retrieving them in chronological order
        System.out.println("\nProcessing events:");
        Event nextEvent;
        while ((nextEvent = eventList.getNextEvent()) != null) {
            System.out.println("Processing " + nextEvent); // Uses modified toString format
        }
    }
}