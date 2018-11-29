import shapes.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TwoDShape ob;
        double totalA, totalP;
        ArrayList<Object> aList = new ArrayList<>();

        Circle circle = new Circle(1.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        Square square = new Square(10.0);
        Rectangle rectangle = new Rectangle(10., 15.);

        aList.add(triangle);
        aList.add(rectangle);
        aList.add(circle);
        aList.add(square);

        System.out.println("\n Objects \t\t\t area \t\t perimeter: ");
        totalA = totalP = 0.0;

        for(Object anAList : aList) {
            ob = (TwoDShape) anAList;
            System.out.print(ob.displayName());
            System.out.print("\t--> " + ob.area());
            System.out.println(" \t: " + ob.perimeter());
            totalA += ob.area();
            totalP += ob.perimeter();
        }

        System.out.print("\nTotal area and perimeter are:");
        System.out.println("\t" + totalA + "  \t:\t  " + totalP);
    }
}
