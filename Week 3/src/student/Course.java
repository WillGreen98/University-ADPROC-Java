package student;

class Course {
    private String name;
    private int numStudents = 0;
    Student[] list = new Student[10];

    Course() {}
    Course(String nm, String cd) {
        this.name = nm;
        String code = cd;
    }

    void addStudent(Student st) {  //needs check first whether the list is full
        list[numStudents] = st;
        numStudents += 1;
    }

    double averageSc() {
        double sum=0.0;
        for(int i=0; i<numStudents; i++)
            sum += list[i].avScore();
        return(sum/numStudents);
    }

    int getNumStud() {
        return numStudents;
    }

    String getName() {
        return name;
    }
}
