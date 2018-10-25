package student;

import java.util.*;

public class Course {
    private String name, code;
    private int numStudents = 0;
    ArrayList < Student > list = new ArrayList < > ();

    Course() {}
    Course(String nm, String cd) {
        name = nm;
        code = cd;
    }

    int getNumStud() {
        return numStudents;
    }
    String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    void addStudent(Student st) {
        list.add(st);
        numStudents++;
    }

    double averageSc() {
        Student work = new Student();
        double s = 0.0;
        for (Student aList: list) {
            work = aList;
            s += work.avScore();
        }
        return (s / list.size());
    }

    int maxAverage() {
        double max = 0.0;
        int ind = 0;
        Student work = new Student();
        for (int i = 0; i < list.size(); i++) {
            work = list.get(i);
            if (max < work.avScore()) {
                max = work.avScore();
                ind = i;
            }
        }
        return ind;
    }
}