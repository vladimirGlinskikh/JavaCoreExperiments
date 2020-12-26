package algorithms.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighArrayTest {
    private HighArray highArray;

    @BeforeEach
    void setUp() {
        highArray = new HighArray(100);
        highArray.insert(2);
        highArray.insert(4);
    }

    @Test
    void find() {
        assertTrue(highArray.find(4));
    }

    @Test
    void delete() {
        assertTrue(highArray.delete(4));
    }
}