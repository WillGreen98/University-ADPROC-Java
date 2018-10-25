package student;

import java.util.Arrays;

public class Student {
    private String name;
    private int [] score = new int[3];   

    public Student() {}
    Student(String name, int student_score[]) {
        this.name = name;
        for(int i=0; i<score.length; i++) score[i]= ((student_score[i]> 0) && (student_score[i]< 101)) ? student_score[i] : 0;
    }

    public String getName()  {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int student_score[]) {
       score = student_score;
    }

    double avScore() {
        double score = Arrays.stream(this.score).asDoubleStream().sum();
        return (score / 3);
    }

    void printOut() {
        System.out.println("\n Student data: ");
        System.out.println("\t name : "+ name);
        for(int i = 0; i < score.length; i++) System.out.print("\t score [" + i + "] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }    
}
