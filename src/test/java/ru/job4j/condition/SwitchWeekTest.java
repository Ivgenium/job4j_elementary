package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void isMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isTuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isWednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isThursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isFriday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isSaturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isMistake() {
        int day = 0;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isMistake2() {
        int day = -50;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void isMistake3() {
        int day = 19;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        assertThat(result).isEqualTo(expected);
    }
}