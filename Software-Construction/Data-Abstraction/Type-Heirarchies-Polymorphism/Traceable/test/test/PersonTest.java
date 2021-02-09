package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person p;
    Fingerprint f;

    @Before
    public void setUp() {
        p = new Person("Harry", 24, "19 Park Street, Los Angeles");
        f = new Fingerprint(p, "Unity Train Station, Los Santos");
    }

    @Test
    public void testSetFingerprint() {
        assertEquals(null, p.getFingerprint());
        p.setFingerprint(f);
        assertEquals(f, p.getFingerprint());
    }

    @Test
    public void testTrack() {
        p.track();
    }

}
