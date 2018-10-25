package student;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);

        int i, num = 0;
        String surname, again;
        boolean answer, exception;
        int[] score = new int[3];

        Student student = new Student();
        ArrayList<Student> stud = new ArrayList<>();

        do {
            System.out.println("\nEnter first and last name,separated by space. ");
            surname = console.nextLine();
            do {
                exception = false;
                try {
                    System.out.println("\n Enter three marks separated by spaces. ");
                    for(i = 0; i < 3; i++) {
                        score[i] = console.nextInt();
                    }
                } catch(Exception exRef) {
                    System.err.println(exRef);
                    System.out.print("Marks should be numerals!");
                    exception = true;
                }
                console.nextLine();
            } while(exception);

            student = new Student(surname, score);
            stud.add(student);
            num++;
            System.out.println("\n Another student (y/n)? ");
            again = console.nextLine();
            answer = again.charAt(0) == 'y';
        } while(answer);

        Course cm = new Course("Computing", "CMP06");
        Course cs = new Course("Computer Science", "CS06");

        for(i = 0; i < num / 2; i++) cm.addStudent(stud.get(i));

        double cmAverage = cm.averageSc();
        int cmNumbers = cm.getNumStud();

        for(i = num / 2; i < num; i++) cs.addStudent(stud.get(i));
        int csNum = cs.getNumStud();
        int ind = cs.maxAverage();

        System.out.println("\ncourse name: " + cm.getName());
        System.out.println("\t average = " + cmAverage);
        System.out.println("\t number of studs  = " + cmNumbers + "\n");

        for(i = 0; i < cmNumbers; i++) {
            student = cm.list.get(i);
            System.out.println("\t " + student.name);
        }

        System.out.println("\n course name: " + cs.getName());
        System.out.println("\t average =  = " + cs.averageSc());
        System.out.print("\t number of studs = " + csNum + "\n");

        for(i = 0; i < csNum; i++) {
            student = cs.list.get(i);
            System.out.println("\t " + student.name);
        }

        student = cs.list.get(ind);
        student.printOut();
    }
}

