package Class;

public interface AttendeeInterface {
    abstract void registerEvent(Event event, Attendee attendee);
    abstract void cancelRegistration(Event event);
}
