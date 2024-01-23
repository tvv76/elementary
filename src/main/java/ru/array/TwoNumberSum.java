package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] {i, j};
                } else if (array[i] + array[j] > target) {
                    break;
                }
            }
        }
        return new int[0];
    }

}
