package ru.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point (0, 0);
        Point b = new Point (2, 0);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05to23then2dot83() {
        double expected = 2.83;
        Point a = new Point (0, 5);
        Point b = new Point (2, 3);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when43to81then4dot47() {
        double expected = 4.47;
        Point a = new Point (4, 3);
        Point b = new Point (8, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55to71then4dot47() {
        double expected = 4.47;
        Point a = new Point (5, 5);
        Point b = new Point (7, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}