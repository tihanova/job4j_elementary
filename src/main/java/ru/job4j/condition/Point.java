package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public double distance(Point another) {
        double rsl = Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
        return rsl;
    }

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public static void main(String[] args) {
        Point a = new Point(4, 2);
        Point b = new Point(0, 2);
        System.out.println(a.distance(b));
    }
}
