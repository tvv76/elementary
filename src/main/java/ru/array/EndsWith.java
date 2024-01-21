package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length) {
            return false;
        }

        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
