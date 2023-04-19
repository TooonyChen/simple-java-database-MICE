package Class;

import java.util.Scanner;

public class Attendee extends Person implements AttendeeInterface
{

    @Override
    public void registerEvent(Event event,Attendee attendee) {
        //此处需要用户输入event，attendee的输入在main中完成

        event.setAttendee(attendee);


    }

    @Override
    public void cancelRegistration(Event event) {

    }

    public Attendee(int ID, String name, String email) {
        super(ID, name, email);
    }

    public Attendee() {
    }

}
