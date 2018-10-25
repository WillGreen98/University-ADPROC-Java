package student;

import java.util.Arrays;

public class Student {
    private String name, id;
    private int[] score = new int[3];

    Student() {}
    Student(String name, String id, int student_score[]) {
        this.name = name;
        this.id = id;
        score = student_score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setScore(int student_score[]) {
        System.arraycopy(student_score, 0, score, 0, 3);
    }

    String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public int[] getScore() {
        return score;
    }

    double avScore() {
        double total = Arrays.stream(score).asDoubleStream().sum();
        return (total / score.length);
    }

    void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : " + name + "\n\t id : " + id);

        for(int i = 0; i < score.length; i++) {
            System.out.print("\t score [" + i + "] = " + score[i]);
        }

        System.out.println("\n\t average score = " + avScore());
    }
}