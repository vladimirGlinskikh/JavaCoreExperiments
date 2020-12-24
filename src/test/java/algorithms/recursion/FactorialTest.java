package algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    void factorial() {
        assertEquals(factorial.factorial(5), 120);
    }
}