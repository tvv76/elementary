package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDivide(double first, double second) {
        return subtraction(first, second)
                + divide(first, second);
    }

    public static double sumMultiplySubstractAndDivide(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }

}
