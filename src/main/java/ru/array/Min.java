package ru.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
