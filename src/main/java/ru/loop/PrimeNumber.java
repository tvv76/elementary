package ru.loop;

import static ru.loop.CheckPrimeNumber.check;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }

}
