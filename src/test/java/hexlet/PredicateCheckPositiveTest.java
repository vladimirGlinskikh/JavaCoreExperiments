package hexlet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicateCheckPositiveTest {

    @Test
    void checksWhenPositive() {
        assertTrue(PredicateCheckPositive.verification(1));
        assertFalse(PredicateCheckPositive.verification(0));
    }

    @Test
    void checksWhenNegative(){
        assertFalse(PredicateCheckPositive.verification(-1));
    }
}
