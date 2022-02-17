package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To10Then10() {
        int first = 3;
        int second = 10;
        int result = Max.max(first, second);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To1Then4() {
        int first = 4;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int first = 2;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1_2_0Then2() {
        int first = 1;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2_4_6Then6() {
        int first = 2;
        int second = 4;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0_4_0_8Then8() {
        int first = 0;
        int second = 4;
        int third = 0;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5_3_0_2Then5() {
        int first = 5;
        int second = 3;
        int third = 0;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}