package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalendarTest {
    Calendar test;
    Date date1, date2;
    Entry a, b, c;

    @Before
    public void setUp() {
        date1 = new Date(10,3,2019);
        date2 = new Date(10,8,2019);
        a = new Reminder(date1, new Time(23, 12), "reminderA");
        b = new Meeting(date2, new Time(23, 12), "reminderA");
        c = new Event(new Date(24, 11, 2018), new Time(34, 8), "test2");
        test = new Calendar(date1);
        test.addEntry(a);
        test.addEntry(b);
        test.addEntry(c);
    }

    @Test
    public void soonestEntry() {
        assertEquals(c, test.soonestEntry());
    }
}