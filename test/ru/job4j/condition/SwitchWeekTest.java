package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void isMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isTuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isWednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isThursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isFriday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isSaturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isMistake() {
        int day = 0;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isMistake2() {
        int day = -50;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isMistake3() {
        int day = 19;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}