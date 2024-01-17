package ru.loop;

public class Counter {

    public static int sumByEven(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                rsl += i;
            }
        }
        return rsl;
    }

}
