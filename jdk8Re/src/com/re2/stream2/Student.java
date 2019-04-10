package com.re2.stream2;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class Student {
    private String name;
    private int score;

    public Student(String naem, int score) {
        this.name = naem;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
