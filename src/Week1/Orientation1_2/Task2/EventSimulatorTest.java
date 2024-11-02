package Week1.Orientation1_2.Task2;

public class EventSimulatorTest {
    public static void main(String[] args) {
        // Create an EventList and add events
        EventList eventList = new EventList();
        eventList.addEvent(new Event("Event1", 5));
        eventList.addEvent(new Event("Event2", 2));
        eventList.addEvent(new Event("Event3", 8));
        eventList.addEvent(new Event("Event4", 3));

        // Print events in the list ordered by time
        System.out.println("Events in chronological order:");
        eventList.printEvents();

        // Process events by retrieving them in chronological order
        System.out.println("\nProcessing events:");
        Event nextEvent;
        while ((nextEvent = eventList.getNextEvent()) != null) {
            System.out.println("Processing " + nextEvent);
        }
    }
}