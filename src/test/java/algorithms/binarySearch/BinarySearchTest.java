package algorithms.binarySearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void rank() {
        int[] array = {2, 4, 8, 7, 9, 13, 24, 56};
        assertEquals(binarySearch.rank(9, array), 4);
    }
}