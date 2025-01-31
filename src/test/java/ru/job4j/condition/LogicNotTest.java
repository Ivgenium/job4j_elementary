package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LogicNotTest {

    @Test
    public void isEven() {
        int number = 20;
        boolean result = LogicNot.isEven(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isPositive() {
        int number = 20;
        boolean result = LogicNot.isPositive(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void notEven() {
        int number = 19;
        boolean result = LogicNot.notEven(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void notPositive() {
        int number = -19;
        boolean result = LogicNot.notPositive(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void notEvenAndPositive() {
        int number = 19;
        boolean result = LogicNot.notEvenAndPositive(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void evenOrNotPositive() {
        int number = -19;
        boolean result = LogicNot.evenOrNotPositive(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void evenOrNotPositive2() {
        int number = 20;
        boolean result = LogicNot.evenOrNotPositive(number);
        boolean expected = true;
        assertThat(result).isEqualTo(expected);
    }
}