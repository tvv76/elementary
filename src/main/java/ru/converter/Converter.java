package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(250);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("250 rubles are " + dollar + " dollars.");

    }

}
