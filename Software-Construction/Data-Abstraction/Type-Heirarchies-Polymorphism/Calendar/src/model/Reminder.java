package model;

public class Reminder extends Entry {
    String note;

    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
    }

    public String getNote() {
        if (note == null)
            return "No note.";
        else
            return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
