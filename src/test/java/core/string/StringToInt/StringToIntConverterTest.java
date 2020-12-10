package core.string.StringToInt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntConverterTest {
    private StringToIntConverter stringToIntConverter;
    String string;

    @BeforeEach
    void setUp() {
        string = "743";
        stringToIntConverter = new StringToIntConverter();
    }

    @AfterEach
    void tearDown() {
        string = null;
    }

    @Test
    void convertWithParseInt() {
        int val = stringToIntConverter.convertWithParseInt(string);
        System.out.println(val);
        assertEquals(val, 743);
    }


    @Test
    void convertWithParseIntWithRadix() {
        int val = stringToIntConverter.convertWithParseIntWithRadix("1010111", 2);
        System.out.println(val);
        assertEquals(val, 87);
    }
}