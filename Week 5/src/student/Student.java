package student;

public class Student {
    String name;
    private int[] score = new int[3];

    Student() {}
    Student(String stName, int stScore[]) {
        name = stName;
        for(int i = 0; i < 3; i++)
            score[i] = ((stScore[i] > 0) && (stScore[i] < 101)) ? stScore[i] : 0;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setScore(int stSc[]) {
        System.arraycopy(stSc, 0, score, 0, 3);
    }

    public String getName() {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    double avScore() {
        double s = 0.0;
        for (int i = 0; i < 3; i++)
            s += score[i];
        return(s / 3.);
    }

    void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : " + name);
        for (int i = 0; i < 3; i++)
            System.out.print("\t score[" + i + "] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }
}