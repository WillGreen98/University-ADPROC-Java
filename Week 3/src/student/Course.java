package student;

class Course {
    private String name;
    private int numStudents = 0;
    Student[] list = new Student[10];

    Course() {}
    Course(String name, String code) {
        this.name = name;
    }

    void addStudent(Student st) {
        list[numStudents] = st;
        numStudents += 1;
    }

    double averageSc() {
        double score = 0.0;
        for(int i = 0; i < numStudents; i++) {
            score += list[i].avScore();
        }
        return (score / numStudents);
    }

    int getNumStud() {
        return numStudents;
    }

    String getName() {
        return name;
    }
}