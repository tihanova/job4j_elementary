package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(4, 2);
        Point b = new Point(0, 2);
        System.out.println(a.distance(b));
    }
}
