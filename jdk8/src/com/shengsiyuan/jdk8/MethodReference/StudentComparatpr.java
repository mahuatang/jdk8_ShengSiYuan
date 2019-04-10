package com.shengsiyuan.jdk8.MethodReference;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class StudentComparatpr {
    public int compareSudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareSudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
