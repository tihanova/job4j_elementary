package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when1isEvenfalse() {
        int num = 1;
        boolean expected = false;
        boolean result = LogicNot.isEven(num);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when0isPositivenfalse() {
        int num = 0;
        boolean expected = false;
        boolean result = LogicNot.isPositive(num);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when5notEventrue() {
        int num = 5;
        boolean expected = true;
        boolean result = LogicNot.notEven(num);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenminus1notPositivetrue() {
        int num = -1;
        boolean expected = true;
        boolean result = LogicNot.notPositive(num);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notEvenAndPositive() {
        int num = 7;
        boolean expected = true;
        boolean result = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void evenOrNotPositive() {
        int num = 6;
        boolean expected = true;
        boolean result = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(result, expected);
    }
}