package org.example;

public class App
{
    public static void main(String[] args )
    {
        Triangle triangle = new Triangle(3, 4, 5);
        boolean t = triangle.triangleOrNot(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());
        if (t == true) {
            System.out.println("The area of a triangle with sides " +
                            triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() +
                    " equal to " +
                    triangle.triangleArea(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        } else {
            System.out.println("The object with sides "+
                    triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() +
                    " is not a triangle");
        }

        Triangle triangle1 = new Triangle(10, 3, 5);
        boolean t1 = triangle1.triangleOrNot(triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC());
        if (t1 == true) {
            System.out.println("The area of a triangle with sides " +
                    triangle1.getSideA() + ", " + triangle1.getSideB() + ", " + triangle1.getSideC() +
                    " equal to " +
                    triangle1.triangleArea(triangle1.getSideA(), triangle1.getSideB(), triangle1.getSideC()));
        } else {
            System.out.println("The object with sides " +
                    triangle1.getSideA() + ", " + triangle1.getSideB() + ", " + triangle1.getSideC() +
                    " is not a triangle");
        }
    }
}
