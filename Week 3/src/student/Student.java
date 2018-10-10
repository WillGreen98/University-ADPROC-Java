package student;

public class Student {
    private String name, id;
    private int [] score = new int[3];

    public Student() {}
    public Student( String stName, String stID, int stScore[]) {
        name = stName;
        id = stID;
        for(int i=0; i<3; i++)
            score[i]= ((stScore[i]> 0) && (stScore[i]< 101)) ? stScore[i] : 0;
    }

    public void setName(String n) {
        name = n;
    }

    public void setID(String sID) {
        id = sID;
    }

    public void setScore(int stSc[]) {
        score = stSc;
    }

    public String getName()  {
        return name;
    }
    public String getID()  {
        return id;
    }
    public int[] getScore() {
        return score;
    }

    public double avScore() {
        double s=0.0;
        for(int i=0; i<3; i++)
            s += score[i];
        return (s/3);
    }

    public void printOut() {
        System.out.println("\n  Student attributes: ");
        System.out.println("\t name : "+name+ "\n\t id : " + id);
        for(int i=0; i<3; i++)
            System.out.print("\tscore ["+ i+"] = "+score[i]);
        System.out.println("\n\t  average score  = "+avScore());
    }
}

