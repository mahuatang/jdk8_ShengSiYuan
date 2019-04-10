package com.re.MethodReference;

public class Student {
    private String name;
    private int score;

    public Student() {

    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int computeByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public static int computeByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int computeByScore2(Student student) {
        return this.getScore() - student.getScore();
    }

    public int computeByName2(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

    @Override
    public String toString() {
        return this.getName() + " : " + this.getScore();
    }
}
