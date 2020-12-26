package algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    private Rank rank;

    @BeforeEach
    void setUp() {
        rank = new Rank();
    }

    @Test
    void rank() {
        int[] a = {12, 14, 45, 23, 67, 24, 75, 34};
        assertEquals(rank.rank(34, a, 2, 10), 4);
    }
}