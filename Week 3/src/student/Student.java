package student;

import java.util.Arrays;

public class Student {
    private String name, id;
    private int[] score = new int[3];

    Student() {}
    Student( String stName, String stID, int stScore[]) {
        name = stName;
        id = stID;
        score = stScore;

        // for(int i = 0; i < 3; i++) {
        // score[i]= ((stScore[i] > 0) && (stScore[i] < 101)) ? stScore[i] : 0;
        // }
    }

    public void setName( String n) {
        name = n;
    }
    public void setID( String sID) {
        id = sID;
    }
    public void setScore(int stSc[]) {
        System.arraycopy(stSc, 0, score, 0, 3);
    }

    String getName()  {
        return name;
    }
    public String getID()  {
        return id;
    }
    public int[] getScore() {
        return score;
    }

    double avScore() {
        double total = Arrays.stream(score).asDoubleStream().sum();
        return (total/score.length);
    }


    void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : "+name+ "\n\t id : " + id);

        for(int i=0; i< score.length; i++) {
            System.out.print("\tscore [" + i + "] = " + score[i]);
        }

        System.out.println("\n\t average score = "+avScore());
    }
}