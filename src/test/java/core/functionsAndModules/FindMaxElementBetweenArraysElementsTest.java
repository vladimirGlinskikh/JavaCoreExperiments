package core.functionsAndModules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxElementBetweenArraysElementsTest {
    private FindMaxElementBetweenArraysElements findMaxElementBetweenArraysElements;

    @BeforeEach
    void setUp() {
        findMaxElementBetweenArraysElements = new FindMaxElementBetweenArraysElements();
    }

    @Test
    void maxElementArrays() {
        double[] elem = {1, 34, 90, 23, 245, 123, 950};
        assertEquals(findMaxElementBetweenArraysElements.maxElementArrays(elem), 950);
    }
}