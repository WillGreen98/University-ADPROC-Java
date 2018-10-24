package student;

import java.util.Arrays;

public class Student {
    private String name;
    private int [] score = new int[3];   

    public Student() {}
    Student(String stName, int stScore[]) {
        name = stName;
        for(int i=0; i<score.length; i++) score[i]= ((stScore[i]> 0) && (stScore[i]< 101)) ? stScore[i] : 0;
    }

    public String  getName()  {
        return name;
    }
    public int[] getScore() {
        return score;
    }
    public void setName(String n) {
        name = n;
    }
    public void setScore(int stSc[]) {
       score = stSc;
    }

    double avScore() {
        double s= Arrays.stream(score).asDoubleStream().sum();
        return (s/3);
    }
    void printOut() {
        System.out.println("\n Student data: ");
        System.out.println("\t name : "+ name);
        for(int i=0; i< score.length; i++) System.out.print("\tscore ["+ i+"] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }    
}
