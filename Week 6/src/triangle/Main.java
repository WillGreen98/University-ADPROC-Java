package triangle;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Triangle triangle = new Triangle(2.0, 4.0, 5.0);
        Triangle tri = new RightTriangle(2.0, 3.0);
        RightTriangle rightTriangle = new RightTriangle(3.0, 4.0);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(2.0);

        System.out.println("triangle area = " + triangle.area());
        System.out.println("triangle perimeter = " + triangle.perimeter());

        System.out.println("rightTriangle area = " + rightTriangle.area());
        System.out.println("rightTriangle perimeter = " + rightTriangle.perimeter());

        System.out.println("equilateralTriangle area = " + equilateralTriangle.area());
        System.out.println("equilateralTriangle perimeter = " + equilateralTriangle.perimeter());

        System.out.println("tri area = " + tri.area());
        System.out.println("tri perimeter = " + tri.perimeter());
    }
}
