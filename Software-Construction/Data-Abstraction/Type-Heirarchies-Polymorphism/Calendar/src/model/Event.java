package model;

public class Event extends Entry {
    Reminder reminder;

    public Event(Date date, Time time, String label) {
        super(date, time, label);
    }

    public Reminder getReminder() {
        return reminder;
    }

    // REQUIRES: reminder != null
    // MODIFIES: this
    // EFFECTS: sets this event's remainder to remainder
    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}
