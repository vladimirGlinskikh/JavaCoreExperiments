package core.objectOrientedConcepts.exceptionHandling.propogatingExceptions;

import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class LeapYearTest {
    protected LeapYear leap;
    protected boolean answer;

    @Before
    public void setUp() throws Exception {
        leap = new LeapYear();
    }

    @Test
    public void leapYearTest1() {
        answer = leap.isLeapYear(new Scanner("2000"));
        assertEquals(true, answer);
    }

    @Test
    public void leapYearTest2() {
        answer = leap.isLeapYear(new Scanner("2100"));
        assertEquals(false, answer);
    }

    @Test
    public void leapYearTest3() {
        answer = leap.isLeapYear(new Scanner("1582"));
        assertEquals(false, answer);
    }

    @Test(expected = InputMismatchException.class)
    public void leapYearTest4() {
        leap.isLeapYear(new Scanner("201o"));
    }

    @Test(expected = NoSuchElementException.class)
    public void leapYearTest5() {
        leap.isLeapYear(new Scanner(""));
    }

    @Test(expected = NullPointerException.class)
    public void leapYearTest6() {
        leap.isLeapYear(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void leapYearTest7() {
        leap.isLeapYear(new Scanner("1581"));
    }
}