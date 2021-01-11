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
        assertEquals(binarySearch.rank(7, array), 2);
    }

    @Test
    void rankSorted() {
        int[] array = {3, 90, 23, 12, 5, 2, 0, 1, 56, 34};
        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
        assertEquals(binarySearch.rank(23, array), 6);
    }
}