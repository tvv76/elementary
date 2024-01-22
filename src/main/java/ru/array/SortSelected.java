package ru.array;

import static ru.array.FindLoop.indexInRange;
import static ru.array.MinDiapason.findMin;
import static ru.array.SwitchArray.swap;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int start = 0; start < data.length; start++) {
            int min = findMin(data, start, data.length - 1);
            int i = indexInRange(data, min, start, data.length - 1);
            data = swap(data, i, start);
        }
        return data;
    }
}
