package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h, l;
        h = p / (2 * (k + 1));
        l = h * k;
        return l * h;
    }
    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result2);
    }
}
