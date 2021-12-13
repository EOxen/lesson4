package org.example;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public boolean triangleOrNot(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public double triangleArea(int a, int b, int c) {
        Triangle triangle = new Triangle(a, b, c);
        if (triangle.triangleOrNot(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()) == true) {
            double pp = (a + b + c) / 2;
            double area = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
            return area;
        } else {
            throw new RuntimeException("Incorrect data. The object is not a triangle.");
        }
    }

}

