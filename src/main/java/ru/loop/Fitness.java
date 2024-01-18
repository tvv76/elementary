package ru.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;

        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
            System.out.println("Ivan: " + ivan + "; nik: " + nik);
        }
        return month;
    }
}
