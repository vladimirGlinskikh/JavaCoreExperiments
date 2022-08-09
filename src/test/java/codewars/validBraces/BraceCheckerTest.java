package codewars.validBraces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BraceCheckerTest {
    private BraceChecker checker = new BraceChecker();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isValid() {
        assertEquals(true, checker.isValid("()"));
        assertEquals(true, checker.isValid("()[]{}"));
        assertEquals(true, checker.isValid("({})[()]{[]}"));
    }

    @Test
    public void isInvalid() {
        assertEquals(false, checker.isValid("[(])"));
        assertEquals(false, checker.isValid("[({})])"));
    }
}