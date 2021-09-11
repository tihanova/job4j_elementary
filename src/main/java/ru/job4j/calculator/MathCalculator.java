package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAnddivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return difference(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен (cумма двух чисел и произведение двух чисел): " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен (разность двух чисел и деление двух чисел): " + differenceAnddivide(10, 20));
        System.out.println("Результат расчета равен (сумма вычисления всех четырех операций): " + sumAll(10, 20));
    }
}