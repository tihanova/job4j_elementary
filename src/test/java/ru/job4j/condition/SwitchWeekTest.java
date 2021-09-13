package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void nameOfDay4() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);

    }
}