package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(6, 1, 3, 1);
        System.out.println("result (6, 1) to (3, 1) " + result);

        result = Point.distance(4, 13, 10, 25);
        System.out.println("result (4, 13) to (10, 25) " + result);
    }
}

