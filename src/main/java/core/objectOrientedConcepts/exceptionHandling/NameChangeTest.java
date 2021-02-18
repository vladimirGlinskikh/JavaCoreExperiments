package core.objectOrientedConcepts.exceptionHandling;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;

import static org.junit.Assert.assertEquals;
import static org.junit.runner.JUnitCore.runClasses;


public class NameChangeTest {
    public final static String EXCEPTION = "java.util.NoSuchElementException";
    public final static int EXCEPTION_LENGTH = EXCEPTION.length();
    protected NameChange change;
    protected String result;

    public static void main(String[] args) {
        Result result = runClasses(NameChangeTest.class);
        System.out.println("Tests run = " + result.getRunCount() +
                "\nTests failed = " + result.getFailures());
    }

    @Before
    public void runBeforeEveryTest() {
        change = new NameChange();
    }

    @Test
    public void rearrangeTest1() {
        result = change.rearrange("Vladimir Vasilivich Glinskikh");
        assertEquals("Glinskikh, Vladimir V.", result);
    }

    @Test
    public void rearrangeTest2() {
        result = change.rearrange("Vladimir Glinskikh");
        assertEquals(EXCEPTION, result.substring(0, EXCEPTION_LENGTH));
    }

    @Test
    public void rearrangeTest3() {
        result = change.rearrange("Vladimir");
        assertEquals(EXCEPTION, result.substring(0, EXCEPTION_LENGTH));
    }

    @Test
    public void rearrangeTest4() {
        result = change.rearrange("");
        assertEquals(EXCEPTION, result.substring(0, EXCEPTION_LENGTH));
    }
}
