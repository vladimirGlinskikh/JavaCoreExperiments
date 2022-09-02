package hexlet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertStringTest {

    @Test
    void convertString() {
        assertThat(ConvertString.convertString("")).isEqualTo("");
        assertThat(ConvertString.convertString("hey")).isEqualTo("yeh");
        assertThat(ConvertString.convertString("Hey")).isEqualTo("Hey");
    }
}