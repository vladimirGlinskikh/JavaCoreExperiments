package javaCodingProblems.stringsAndNumbers.concatenatingTheSameStringNTimes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatStringTest {
    private ConcatString concatString;
    String string;

    @BeforeEach
    void setUp() {
        string = "concat";
        concatString = new ConcatString();
    }

    @AfterEach
    void tearDown() {
        string = null;
    }

    @Test
    void concatRepeat() {
        String str = concatString.concatRepeat(string, 3);
        System.out.println(str);
        assertEquals("concatconcatconcat", "concatconcatconcat");
    }

    @Test
    void hasOnlySubstrings() {
        boolean str = concatString.hasOnlySubstrings("concatconcat");
        System.out.println(str);
        assertTrue(str);

        boolean str1 = concatString.hasOnlySubstrings("concat");
        System.out.println(str1);
        assertFalse(str1);
    }
}