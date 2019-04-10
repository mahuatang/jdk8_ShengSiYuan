package com.shengsiyuan.jdk8.MethodReference;

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

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareStudentByScore2(Student student, Student student2) {
        return student.getScore() - student2.getScore();
    }

    public static int compareStudentByName2(Student student, Student student2) {
        return student.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareStudentByScore(Student student) {
        return this.getScore() - student.getScore();
    }

    public int compareStudentByName(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

    public int compareStudentByName3(Student student, Student student2) {
        return student.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareStudentByScore3(Student student, Student student2) {
        return student.getScore() - student2.getScore();
    }
}
