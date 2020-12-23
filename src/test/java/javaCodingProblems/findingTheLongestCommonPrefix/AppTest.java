package javaCodingProblems.findingTheLongestCommonPrefix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void longestCommonPrefix() {
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef", "a"};
        assertEquals(app.longestCommonPrefix(texts), "a");
    }
}