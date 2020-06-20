package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    Date date;
    String email;
    List<Entry> entries;

    public Calendar(Date date) {
        this.date = date;
        entries = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: Adds an entry to the calendar
    public void addEntry(Entry e) {
        entries.add(e);
    }

    // MODIFIES: this
    // EFFECTS: Removes an entry from the list
    public void removeEntry(Entry e) {
        if (entries.contains(e))
            entries.remove(e);
    }

    // EFFECTS: Return the earliest entry in the calender by date
    public Entry soonestEntry() {
        Entry earliest = null, temp = null;
        int index = 0;
        earliest = entries.get(index);
        while (index < entries.size()) {
            temp = entries.get(index);
            if (Date.isGreaterThan(temp.getEntryDate(), earliest.getEntryDate()))
                earliest = temp;
            index++;
        }

        return earliest;
    }

    // EFFECTS: Print all the entries in the instance
    public void printEntries() {
        System.out.println("Associated Entries: ");
        for (Entry entry : entries)
            System.out.println(entry.getLabel() + " on " + entry.getEntryDate().getDateLong() + " at " + entry.getTime().getTime24());
    }

    // EFFECTS: Print all the entries in the instance of type
    public void printEntries(Class<?> type) {
        System.out.println("Associated " + type.getSimpleName() + " Entries: ");
        for (Entry entry : entries)
            if (entry.getClass() == type)
                System.out.println(type.getSimpleName() + ": " + entry.getLabel() + " on " + entry.getEntryDate().getDateLong() + " at " + entry.getTime().getTime24());
    }

    // getters & setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
