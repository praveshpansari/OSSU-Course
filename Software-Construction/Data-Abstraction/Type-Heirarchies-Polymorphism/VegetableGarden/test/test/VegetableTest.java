package test;

import model.VegType;
import model.veggies.Radish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetableTest {
    Radish test;

    @Before
    public void setUp() {
        test = new Radish();
    }

    @Test
    public void testAll() {
        assertEquals("Radish", test.getName());
        assertEquals(VegType.ROOT, test.getType());
        assertEquals("Sow seeds 4–6 weeks before the average date of last frost.",test.getInstructions());
    }

}
