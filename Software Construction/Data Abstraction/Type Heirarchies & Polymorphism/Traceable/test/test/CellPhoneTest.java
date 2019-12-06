package test;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellPhoneTest {
    Person owner, called;
    CellPhone c;
    Call call;

    @Before
    public void setUp() {
        owner = new Person("Harry", 19, "13 Central Park, Amsterdam");
        called = new Person("Sherlock", 25, "13B Baker Street, London");
        c = new CellPhone(owner, "13 Central Park, Amsterdam");
        call = new Call(called, "13B Baker Street, London");
    }

    @Test
    public void testAddCall() {
        assertFalse(c.getCalls().contains(call));
        c.addCall(call);
        assertTrue(c.getCalls().contains(call));
    }

    @Test
    public void testTrack() {
        c.track();
    }

}
