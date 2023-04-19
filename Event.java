package Class;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Event
{
    private int EventID;
    private String Name;
    private String Date;
    private String Location;
    private String Organizer;
    //装Attendee的集合
    ArrayList<Attendee> AttendeeList=new ArrayList<>();
    //constructors
    public Event() {
    }

    public Event(int ID, String name, String date, String location, String organizer) {
        this.EventID = ID;
        this.Name = name;
        this.Date = date;
        this.Location = location;
        this.Organizer = organizer;
    }
    //getter and setter

    public void setAttendee(Attendee attendee) {
        AttendeeList.add(attendee);

    }

    public ArrayList<Attendee> getAttendee() {
        return AttendeeList;
    }

    public int getID() {
        return EventID;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }

    public String getLocation() {
        return Location;
    }

    public String getOrganizer() {
        return Organizer;
    }

    public void setID(int ID) {
        this.EventID = ID;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public void setOrganizer(String organizer) {
        this.Organizer = organizer;
    }
}
