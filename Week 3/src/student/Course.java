package student;

public class Course {
    private String name, code;
    private int numStudents = 0;
    Student[] list = new Student[10];

    /** Creates a new instance of Course */
    public Course() {}
    public Course(String nm, String cd) {
        name = nm;
        code = cd;
    }

    public void addStudent(Student st) {  //needs check first whether the list is full
        list[numStudents] = st;
        numStudents += 1;
    }

    public double averageSc() {
        double sum=0.0;
        for(int i=0; i<numStudents; i++)
            sum += list[i].avScore();
        return(sum/numStudents);
    }

    public int getNumStud() {
        return numStudents;
    }

    public String getName() {
        return name;
    }
}
