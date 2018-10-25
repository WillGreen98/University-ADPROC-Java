package student;

public class Student {
    private String name, id;
    private int[] score = new int[3];

    public Student() {}
    Student(String name, String id, int student_score[]) {
        this.name = name;
        this.id = id;
        for(int i=0; i<3; i++)
            score[i]= ((student_score[i]> 0) && (student_score[i]< 101)) ? student_score[i] : 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setScore(int student_score[]) {
        this.score = student_score;
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

    double avScore() {
        double score = 0.0;
        for(int i = 0; i < 3; i++) score += this.score[i];
        return(score/3);
    }

    void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : " + name + "\n\t id: " + id);
        for(int i=0; i<3; i++) System.out.print("\t score [" +  i + "] = " + score[i]);
        System.out.println("\n\t average score = " + avScore());
    }
}

