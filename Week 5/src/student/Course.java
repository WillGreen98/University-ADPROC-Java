package student;

import java.util.*;

public class Course {
    private String name, code;
    private int numStudents = 0;
    ArrayList<Student> list = new ArrayList<>();

    Course() {}
    Course(String name, String code) {
        this.name = name;
        this.code = code;
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
        Student student = new Student();
        double score = 0.0;
        for(Student stud: list) {
            student = stud;
            score += student.avScore();
        }
        return (score / list.size());
    }

    int maxAverage() {
        double max = 0.0;
        int ind = 0;
        Student student = new Student();
        for(int i = 0; i < list.size(); i++) {
            student = list.get(i);
            if (max < student.avScore()) {
                max = student.avScore();
                ind = i;
            }
        }
        return ind;
    }
}