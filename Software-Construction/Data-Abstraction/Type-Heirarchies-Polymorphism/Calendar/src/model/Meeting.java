package model;

import java.util.ArrayList;
import java.util.List;


public class Meeting extends Event {

    List<String> attendees;

    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
        attendees = new ArrayList<>();
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void addAttendee(String attendee) {
        attendees.add(attendee);
    }

    public void removeAttendees(String attendee) {
        attendees.remove(attendee);
    }


    // EFFECTS: Prints out the email of each attendee with some prefix
    public void sendInvites() {
        for (String attendee : attendees)
            System.out.println("Inviting: " + attendee);
    }


}
