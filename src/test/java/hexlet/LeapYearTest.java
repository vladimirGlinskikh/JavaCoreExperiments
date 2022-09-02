package hexlet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    @Test
    void isLeapYear() {
        assertThat(LeapYear.isLeapYear(2016)).isTrue();
        assertThat(LeapYear.isLeapYear(2000)).isTrue();
        assertThat(LeapYear.isLeapYear(2017)).isFalse();
        assertThat(LeapYear.isLeapYear(2018)).isFalse();
        assertThat(LeapYear.isLeapYear(1900)).isFalse();
    }
}