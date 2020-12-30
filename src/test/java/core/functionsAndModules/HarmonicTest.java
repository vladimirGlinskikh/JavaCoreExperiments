package core.functionsAndModules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarmonicTest {
    private Harmonic harmonic;

    @BeforeEach
    void setUp() {
        harmonic = new Harmonic();
    }

    @Test
    void harmonic() {
        assertEquals(harmonic.harmonic(2), 1.5);
    }
}