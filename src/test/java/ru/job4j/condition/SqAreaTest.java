package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

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
    public void whenP24K3Square27() {
        int expected = 27;
        int p = 24;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP40K9Square36() {
        int expected = 36;
        int p = 40;
        double k = 9;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}