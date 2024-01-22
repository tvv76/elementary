package ru.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }
        return table;
    }
}
