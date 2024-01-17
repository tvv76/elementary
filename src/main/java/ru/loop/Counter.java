package ru.loop;

public class Counter {

    public static int sumByEven(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            rsl += i % 2 == 0 ? i : 0;
        }
        return rsl;
    }

}
