package student;

public class Student {
    String name;
    private int[] score = new int[3];

    Student() {}
    Student(String name, int student_score[]) {
        this.name = name;
        for(int i = 0; i < 3; i++)
            score[i] = ((student_score[i] > 0) && (student_score[i] < 101)) ? student_score[i] : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int student_score[]) {
        System.arraycopy(student_score, 0, score, 0, 3);
    }

    public String getName() {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    double avScore() {
        double score = 0.0;
        for(int i = 0; i < 3; i++) score += this.score[i];
        return (score / 3);
    }

    void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : " + name);
        for(int i = 0; i < 3; i++) System.out.print("\t score[" + i + "] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }
}