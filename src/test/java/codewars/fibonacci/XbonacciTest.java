package codewars.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XbonacciTest {
    private Xbonacci variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    @After
    public void tearDown() {
        variabonacci = null;
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, variabonacci.xbonacci(new double[]{0, 1}, 10));
        assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, variabonacci.xbonacci(new double[]{1, 1}, 10));
        assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16}, variabonacci.xbonacci(new double[]{0, 0, 0, 0, 1}, 10));
        assertArrayEquals(new double[]{1, 0, 0, 0, 0, 0, 1, 2, 3, 6}, variabonacci.xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10));
    }
}