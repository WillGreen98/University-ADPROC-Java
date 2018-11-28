package triangle;

import java.text.*;
import java.io.*;
import java.util.*;

public class Output {
    private static double input(BufferedReader r, String prompt) throws IOException {
        double side = 0.0;
        try {
            System.out.println("Please enter "+ prompt);
            String myString = r.readLine();
            side = Double.parseDouble(myString);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a number!\n" + nfe);
        }
        return side;
    }

    public static void main(String[] args) throws IOException {
        ArrayList aList = new ArrayList();
        Triangle ob = new Triangle();
        int choice = 0;
        double side1, side2, side3;
        boolean exceptThrown;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        do {
            try {
                exceptThrown = false;
                System.out.print(" Please choose a triangular object to add ");
                System.out.println("(1: General; 2: Equilateral; 3: Right; 0: None):");
                String myString = br.readLine();
                choice = Integer.parseInt(myString);
            } catch (NumberFormatException nfe) {
                exceptThrown = true;
                System.out.println("Please enter a number!\n" + nfe);
            }

            switch(choice) {
                case 1: side1 = input(br, "side1: ");
                    side2 = input (br, "side2: ");
                    side3 = input (br, "side3: ");
                    Triangle tri = new Triangle(side1, side2, side3);
                    aList.add((Object) tri);
                    break;
                case 2: side1 = input(br, "side: ");
                    EquilateralTriangle equi = new EquilateralTriangle(side1);
                    aList.add((Object) equi);
                    break;
                case 3: side1 = input(br, "side1: ");
                    side2 = input (br, "side2: ");
                    RightTriangle rig = new RightTriangle(side1, side2 );
                    aList.add((Object) rig);
                    break;
                case 0: break;
                default:  System.out.println("\n Wrong choice!");
                    exceptThrown = true;
            }

        } while (choice != 0 && exceptThrown);

        if(!exceptThrown) {
            double totalA, totalP;
            System.out.println("\n Objects \t\t\t area \t\t perimeter: ");
            totalA = totalP =0.0;

            for(Object anAList : aList) {
                ob = (Triangle) anAList;
                System.out.print(ob.displayName());
                System.out.print("\t--> " + ob.area());
                System.out.println(" \t: " + ob.perimeter());
                totalA += ob.area();
                totalP += ob.perimeter();
            }

            NumberFormat nf;
            nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(3);
            String areaTotal = nf.format(totalA);
            String perimTotal = nf.format(totalP);

            System.out.print("\n Total area and average perimeter are:");
            System.out.println("\t\t" + areaTotal+ ": " + Integer.parseInt(perimTotal) / aList.size());
        }
    }
}

