package ru.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;

        if (n < 2) return result;

        for (int i = 1; i <= n; i++) result *= i;

        return result;
    }
}
