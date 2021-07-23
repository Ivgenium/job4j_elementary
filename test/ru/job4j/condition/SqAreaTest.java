package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP36K5Square45() {
        double p = 36, k = 5;
        double expected = 45.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K3Square6Point75() {
        double p = 12, k = 3;
        double expected = 6.75;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}