package com.re2.MethodReference;

public class Student {
    private String name;
    private int score;

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

    public void setAge(int score) {
        this.score = score;
    }
    public static int getStudentByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public static int getStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student) {
        return this.getName().compareTo(student.getName());
    }

    public int compareStudentByScore(Student student) {
        return this.getScore() - student.getScore();
    }
}
