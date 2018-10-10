package student;

public class Main {
    public Main() {}

    /**  @param args - the command line arguments */
    public static void main (String[] args)  {
        String myString;
        int [] sScore1 ={40, 55, 30};

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1);

        String sName = "Augusta Ada", sID = "0123aa";
        int [] sScore2 ={88, 99, 85};
        Student stud2 = new Student(sName, sID, sScore2); 	// second object
        stud1.printOut();  	// print out the object information
        stud2.printOut();
        int[] sScore3 = new int[3];
        for (int i=0; i<3; i++) {
            sScore3[i]= (int)(Math.random()*100);     // Mat.random() returns a double  between 0 and 1
        }
        // third object
        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);
        stud3.printOut();
        // find out the maximum average
        double maxAveScore = stud1.avScore();
        int k=1;
        if (maxAveScore < stud2.avScore()) {
            maxAveScore = stud2.avScore();
            k=2;
        }
        if (maxAveScore < stud3.avScore()) {
            maxAveScore = stud3.avScore();
            k=3;
        }
// this could have been done much easier if an array (array list) of objects has been used?!
        System.out.print("\n The best student: ");
        switch (k){			// ‘k’ shows the best student
            case 1: stud1.printOut();
                break;
            case 2: stud2.printOut();
                break;
            case 3: stud3.printOut();
                break;
            default: break;
        }
    }
}
