package ru.array;

public class Turn {
    public static int[] back(int[] array) {
        int turns = array.length / 2;
        for (int i = 0; i < turns; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

}
