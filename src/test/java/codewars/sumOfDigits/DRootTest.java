package codewars.sumOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {

    @Test
    void digitalRoot1() {
        assertEquals(7, DRoot.digitalRoot(16));
        assertEquals(6, DRoot.digitalRoot(456));
    }
}