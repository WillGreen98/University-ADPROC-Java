package student;

import java.util.ArrayList;

public class Course {
    private String name;
    private int numStudents = 0;
    ArrayList<Student> list = new ArrayList<Student>();	

    public Course() {}
    Course(String name, String code) {
        this.name = name;
    }

    int getNumStud() {
        return numStudents;
    }

    String getName() {
        return name;
    }

    void addStudent(Student student) {
        list.add(student);
        numStudents++;
    }

    double averageSc() {
        double score = 0.0;
        for(int i = 0; i < numStudents; i++) {
            score += list.get(i).avScore();
        }
        return (score / numStudents);
    }
}
