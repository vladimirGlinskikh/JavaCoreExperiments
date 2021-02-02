package core.objectOrientedConcepts.methodTesting;

import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.FullTimeEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToStringTest {
    private FullTimeEmployee full;
    private String expected;

    @BeforeEach
    void setUp() {
        full = new FullTimeEmployee("a", 150.00);
        full = new FullTimeEmployee("b", 356.78);
    }


    @Test
    public void toStringTest() {
        expected = "a $150.00 FULL TIME";
        assertNotEquals(expected, full.toString());
    }

    @Test
    public void toStringTest1() {
        expected = "b $356.78 HOURLY";
        assertEquals(expected, full.toString());
    }

    @Test
    public void toStringTest2() {
        full = new FullTimeEmployee();
        expected = " $0.00 HOURLY";
        assertEquals(expected, full.toString());
    }
}