package student;

import java.io.*;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sName, again;
        int num = 0;
        boolean answer = false;
        int[] sMarks = new int[3];

        ArrayList<Student> stud = new ArrayList<Student>();

        do {
            System.out.println("\n Enter student first and last name, separated by space.");
            sName = scanner.nextLine();
            System.out.println("Enter three marks separated with whitespace!");

            for(int i = 0; i < sMarks.length; i++) sMarks[i] = scanner.nextInt();

            scanner.nextLine();

            Student current = new Student(sName, sMarks);
            stud.add(current);
            System.out.println("\n Another student (y/n)?");
            again = scanner.nextLine();

            if(again.charAt(0) == 'y') {
                answer = true;
                num++;
            }

        } while(answer);

        Course cm = new Course("Computing", "CMP06");
        Course cs = new Course("Computer Science", "CS06");

        int cmNumbers = cm.getNumStud();
        double cmAverage = (cmNumbers == 0) ? 0 : cm.averageSc();

        for(int i = 0; i < num / 2; i++) cm.addStudent(stud.get(i)); // Why use a for loop if always false?
        for(int i = num / 2; i < num; i++) cs.addStudent(stud.get(i)); // Ditto

        for(int i = 0; i < cmNumbers; i++) {
            cm.list.get(i).printOut();
            System.out.println("\t average score:" + cm.list.get(i).avScore());
        }


        System.out.println("\ncourse name: " + cm.getName());
        System.out.println("\t course average = " + cmAverage);
        System.out.println("\t number of stud = " + cmNumbers);

        System.out.println("\n course name: " + cs.getName());
        System.out.println("\t average =  = " + cs.averageSc());
        System.out.println("\t number of stud = " + cs.getNumStud());
    }
}
