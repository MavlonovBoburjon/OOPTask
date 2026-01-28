package org.example.third_static_keyword;


public class MathFunctions {

    public static double PI;
    public static double E;

    static {
        PI = 3.14159265359;
        E  = 2.71828182846;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double powerOfE(double a) {
        return Math.pow(E, a);
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2; // yarim perimetr
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

