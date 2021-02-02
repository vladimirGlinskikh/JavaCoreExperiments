package core.objectOrientedConcepts.methodTesting;

import core.objectOrientedConcepts.dataAbstraction.anInterfaceAndAClassThatImplementsTheInterface.FullTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToStringTest {

    @Test
    public void toStringTest(){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("a", 150.00);
        String expected = "a $150.00 FULL TIME";
        assertNotEquals(expected, fullTimeEmployee.toString());
    }
}