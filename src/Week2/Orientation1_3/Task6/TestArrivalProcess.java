package Week2.Orientation1_3.Task6;

public class TestArrivalProcess {
    public static void main(String[] args) {
        // Create an event list
        EventList eventList = new EventList();

        // Create an ArrivalProcess object
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.Arrival, 5.0, 2.0);

        // Add 10 arrival events to the event list
        for (int i = 1; i <= 10; i++) {
            arrivalProcess.addNewEvent(eventList, "Event " + i);
        }

        // Print the event list
        eventList.printEvents();
    }
}