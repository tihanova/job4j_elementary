package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        String str = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(str);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}