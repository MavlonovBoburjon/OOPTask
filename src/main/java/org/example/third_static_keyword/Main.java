package org.example.third_static_keyword;

public class Main {

    public static void main(String[] args) {

        double circle = MathFunctions.circleArea(5);
        System.out.println("Circle area: " + circle);

        double exp = MathFunctions.powerOfE(2);
        System.out.println("e^2 = " + exp);

        double triangle = MathFunctions.triangleArea(3, 4, 5);
        System.out.println("Triangle area: " + triangle);
    }
}
