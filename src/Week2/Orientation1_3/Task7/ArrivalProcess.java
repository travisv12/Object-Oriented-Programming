package Week2.Orientation1_3.Task7;

import eduni.distributions.Normal;

public class ArrivalProcess {
    private EventType eventType;
    private Normal randomGenerator;

    public ArrivalProcess(EventType eventType, double mean, double variance) {
        this.eventType = eventType;
        this.randomGenerator = new Normal(mean, variance);
    }

    public void addNewEvent(EventList eventList, String eventName) {
        int time = (int) Clock.getInstance().getTime() + (int) randomGenerator.sample();
        Event event = new Event(eventName, time, eventType);
        eventList.addEvent(event);
        Clock.getInstance().setTime(time);
    }
}