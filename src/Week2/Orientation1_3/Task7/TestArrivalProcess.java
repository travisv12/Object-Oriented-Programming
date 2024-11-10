package Week2.Orientation1_3.Task7;

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

        // Display the time of the last event created
        System.out.println("Time of the last event created: " + Clock.getInstance().getTime());

        // Process events and add customers to the service point queue
        ServicePoint servicePoint = new ServicePoint();
        Event event;
        while ((event = eventList.getNextEvent()) != null) {
            Customer customer = new Customer(event.getTime());
            servicePoint.addToQueue(customer);
        }

        // Serve customers and print the time each customer spent in the system
        servicePoint.serve();
    }
}