package javaCodingProblems.objectsImmutabilityAndSwitchExpressions.checkingNullReferencesInFunctionalStyleAndImperativeCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void eventIntegers() {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 16, 7, null, 24);
        assertEquals(app.eventIntegers(numbers), Arrays.asList(2,4,16,24));
    }
}