package student;

public class Main {
    public static void main (String[] args)  {
        int k = 1;
        String myString;
        String sName = "Augusta Ada", sID = "0123aa";

        int[] sScore1 = {40, 55, 30};
        int[] sScore2 = {88, 99, 85};
        int[] sScore3 = new int[3];

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1);
        Student stud2 = new Student(sName, sID, sScore2); 	// second object
        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);


        stud1.printOut();
        stud3.printOut();
        stud2.printOut();

        double maxAveScore = stud1.avScore();

        for(int i=0; i<3; i++) sScore3[i]= (int)(Math.random()*100);

        if(maxAveScore < stud2.avScore()) {
            maxAveScore = stud2.avScore();
            k = 2;
        }

        if(maxAveScore < stud3.avScore()) {
            maxAveScore = stud3.avScore();
            k = 3;
        }

        System.out.print("\n The best student: ");
        switch(k) {
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
