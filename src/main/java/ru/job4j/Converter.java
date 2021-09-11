package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String [] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToEuro(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}
