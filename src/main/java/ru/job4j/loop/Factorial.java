package ru.job4j.loop;

public class Factorial {
    public static int calculate(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}