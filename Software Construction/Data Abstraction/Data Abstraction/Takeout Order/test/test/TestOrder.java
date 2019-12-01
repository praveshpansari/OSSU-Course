package test;

import model.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestOrder {
    Order testOrder;

    @Before
    public void setUp() {
        testOrder = new Order(75, "Mrs.Suzi", 'C');
    }

    @Test
    public void testConstructor() {
        assertEquals("Mrs.Suzi", testOrder.getCustomerName());
        assertEquals(9.99, testOrder.getPrice(), 1f);
        assertFalse(testOrder.getStatus());
    }

    @Test
    public void testSetInstructions() {
        testOrder.setInstructions("Extra Cheese.");
        assertEquals("Extra Cheese.", testOrder.getSpecial());
    }

    @Test
    public void testGetPrice() {
        assertEquals(9.99, testOrder.getPrice(), 1f);
        testOrder = new Order(76, "Mrs.Suzi", 'A');
        assertEquals(4.99, testOrder.getPrice(), 1f);
    }

}
