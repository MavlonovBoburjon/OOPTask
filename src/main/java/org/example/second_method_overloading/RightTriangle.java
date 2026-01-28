package org.example.second_method_overloading;

public class RightTriangle {

    private double a;
    private double b;
    private double c;

    // Constructor
    public RightTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // ====== PERIMETER (Overloading) ======
    public int perimeter(int a, int b, int c) {
        return a + b + c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public float perimeter(float a, float b, float c) {
        return a + b + c;
    }

    public long perimeter(long a, long b, long c) {
        return a + b + c;
    }

    // ====== AREA (Overloading) ======
    public double area(int a, int b) {
        return (a * b) / 2.0;
    }

    public double area() {
        return (a * b) / 2;
    }

    public double area(float a, float b) {
        return (a * b) / 2;
    }

    public double area(long a, long b) {
        return (a * b) / 2.0;
    }
}

