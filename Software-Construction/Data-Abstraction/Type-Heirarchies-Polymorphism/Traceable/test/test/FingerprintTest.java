package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerprintTest {
    Person owner;
    Fingerprint f;

    @Before
    public void setUp() {
        owner = new Person("Sherlock", 25, "13B Baker Street, London");
        f = new Fingerprint(owner, "Los Santos International Airport");
    }

    @Test
    public void testGetOwner() {
        assertEquals(owner, f.getOwner());
    }

    @Test
    public void testTrack() {
        f.track();
    }

}
