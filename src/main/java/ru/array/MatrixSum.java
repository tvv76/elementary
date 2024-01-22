package ru.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] row : array) {
            for (int num : row) {
                rsl += num;
            }
        }
        return rsl;
    }
}
