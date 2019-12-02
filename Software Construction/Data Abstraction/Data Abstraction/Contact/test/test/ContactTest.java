package test;

import model.Contact;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ContactTest {

    Contact test;

    @Before
    public void setUp() {
        test = new Contact("test");
    }

    @Test
    public void setType() {
        test.setType(Contact.ContactType.WORK);
        assertEquals(Contact.ContactType.WORK, test.getType());
    }

    @Test
    public void call() {
        test.call("23/12/13");
        assertEquals("23/12/13\n", test.getCallLog());
    }

    @Test
    public void automateResponse() {
        test.setType(Contact.ContactType.WORK);
        assertEquals("I'll get you back at work.", test.automateResponse());
    }
}