package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void is1Rus() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is1Eng() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is2Rus() {
        String day = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is2Eng() {
        String day = "Tuesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is3Rus() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is3Eng() {
        String day = "Wednesday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is4Rus() {
        String day = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is4Eng() {
        String day = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is5Rus() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is5Eng() {
        String day = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is6Rus() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is6Eng() {
        String day = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is7Rus() {
        String day = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void is7Eng() {
        String day = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isMinus1Rus() {
        String day = "Понедрельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isMinus1Eng() {
        String day = "Synday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}