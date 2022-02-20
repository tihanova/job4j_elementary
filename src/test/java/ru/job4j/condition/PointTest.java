package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to22then2Dot236() {
        double expected = 2.236;
        Point a = new Point(1, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to24then3Dot1622() {
        double expected = 3.1622;
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to06then6() {
        double expected = 6;
        Point a = new Point(0, 0);
        Point b = new Point(0, -6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when009to0minus69then6() {
        double expected = 6;
        Point a = new Point(0, 0, 9);
        Point b = new Point(0, -6, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when021to409then9Dot165() {
        double expected = 9.165;
        Point a = new Point(0, 2, 1);
        Point b = new Point(4, 0, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}