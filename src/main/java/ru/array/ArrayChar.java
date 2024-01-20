package ru.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        if (pref.length > word.length) {
            return false;
        }

        boolean result = true;
        for (int i = 0; i < pref.length; i ++) {
            if (!(word[i] == pref[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
