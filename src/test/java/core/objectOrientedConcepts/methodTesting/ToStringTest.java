package core.objectOrientedConcepts.methodTesting;

import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.FullTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToStringTest {
    protected FullTimeEmployee full;
    protected String expected;

    @Test
    public void toStringTest(){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("a", 150.00);
        String expected = "a $150.00 FULL TIME";
        assertNotEquals(expected, fullTimeEmployee.toString());
    }

    @Test
    public void toStringTest1(){
        full = new FullTimeEmployee("b", 356.78);
        expected = "b $356.78 HOURLY";
        assertEquals(expected, full.toString());
    }

    @Test
    public void toStringTest2(){
        full = new FullTimeEmployee();
        expected = " $0.00 HOURLY";
        assertEquals(expected, full.toString());
    }
}