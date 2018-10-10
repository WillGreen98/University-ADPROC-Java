package student;

public class Main {
    public Main() {}

    /**  @param args - the command line arguments */
    public static void main(String[] args)  {
        String myString;
        String  sName = "Augusta Ada", sID = "0123aa";

        int[] sScore1 ={40, 60, 50};
        int[] sScore2 ={70, 50, 50};
        int[] sScore3 = new int[3];

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1);
        Student stud2 = new Student(sName, sID, sScore2);
        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);

        Course cm = new Course("Computing", "CMP06");
        Course cs = new Course("Computer Science", "CS06");

        double cmAverage = cm.averageSc();
        int cmNumbers = cm.getNumStud();

        stud1.printOut();
        stud2.printOut();
        stud3.printOut();

        for(int i=0; i < 3; i++) {
            sScore3[i]= (int)(Math.random()*100);
        }

        cm.addStudent(stud1);
        cm.addStudent(stud2);
        cs.addStudent(stud3);

        System.out.println("\n course name: "+ cm.getName());
        System.out.println("\t average = "+ cmAverage);
        System.out.println("\t stud number = "+ cmNumbers);

        for(int i=0; i < cmNumbers; i++) {
            System.out.println("\t " + cm.list[i].getName());
        }

        System.out.println("\n course name: "+ cs.getName());
        System.out.println("\t average =  = "+ cs.averageSc());
        System.out.println("\t stud number = "+ cs.getNumStud());
    }
}
