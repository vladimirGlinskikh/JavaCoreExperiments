package javaRushAnswers.task0304;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();

    @Test
    void percent() {
        assertEquals(app.percent(9), 9.9);
    }
}