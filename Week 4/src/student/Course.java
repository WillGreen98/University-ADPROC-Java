package student;

import java.util.ArrayList;

public class Course {
    private String name;
    private int numStudents = 0;
    ArrayList<Student> list = new ArrayList<Student>();	

    public Course() {}
    Course(String nm, String cd) {
        name = nm;
        String code = cd;
    }

    protected int getNumStud() { return numStudents; }
    protected String getName() {
        return name;
    }

    protected void addStudent(Student st) {
        list.add(st);
        numStudents++;
    }

    protected double averageSc() {
        double s = 0.0;
        for(int i = 0; i < numStudents; i++) {
            s += list.get(i).avScore();
        }
        return (s / numStudents);
    }
}
