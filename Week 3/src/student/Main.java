package student;

public class Main {
    public Main() {}

    /**  @param args - the command line arguments */
    public static void main(String[] args)  {
        String myString;
        String  sName = "Augusta Ada", sID = "0123aa";

        int[] score1 ={40, 60, 50};
        int[] score2 ={70, 50, 50};
        int[] student_score = new int[3];

        for(int i = 0; i < 3; i++) {
            student_score[i]= (int)(Math.random()*100);
        }

        Course cm = new Course("Computing", "CMP06");
        Course cs = new Course("Computer Science", "CS06");
        Course cys = new Course("Cyber Security", "CYS06");
        Course se = new Course("Software Engineering", "SE06");

        int cmNumbers = cm.getNumStud();
        int csNumbers = cs.getNumStud();
        int cysNumbers = cys.getNumStud();
        int seNumbers = se.getNumStud();

        double cmAverage = (cmNumbers == 0) ? 0 : cm.averageSc();
        double csAverage = (csNumbers == 0) ? 0 : cs.averageSc();
        double cysAverage = (cysNumbers == 0) ? 0 : cys.averageSc();
        double seAverage = (seNumbers == 0) ? 0 : se.averageSc();

        Student[] students = new Student[] {
                new Student(sName, sID, score2),
                new Student("Charles Babbage", "1234cb", score1),
                new Student("John Atanasoff", "9876ja", student_score),
        };

        //cm.addStudent(students[0]);  // Testing for Average of 0
        cs.addStudent(students[1]);
        cys.addStudent(students[2]);
        se.addStudent(students[0]);

        for(Student student: students) student.printOut();

        // Ugly Formatting
        System.out.println("Course Name: " + cm.getName() +
                "\n\t Average: " + cmAverage +
                "\n\t Student Number: " + cmNumbers + "\n");

        System.out.println("Course Name: " + cs.getName() +
                "\n\t Average: " + cs.averageSc() +
                "\n\t Student Number: " + cs.getNumStud() + "\n");

        System.out.println("Course Name: " + cys.getName() +
                "\n\t Average: " + cys.averageSc() +
                "\n\t Student Number: " + cys.getNumStud() + "\n");

        System.out.println("Course Name: " + se.getName() +
                "\n\t Average: " + se.averageSc() +
                "\n\t Student Number: " + se.getNumStud() + "\n");

        for(int i = 0; i < cmNumbers; i++) {
            System.out.println(cm.list[i].getName() + "\t" +
                    cs.list[i].getName() + "\t" +
                    cys.list[i].getName() + "\t" +
                    se.list[i].getName());
        }
    }
}
