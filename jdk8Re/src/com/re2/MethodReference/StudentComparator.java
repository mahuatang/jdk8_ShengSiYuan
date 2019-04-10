package com.re2.MethodReference;

public class StudentComparator {
    public int getStudentByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public int getStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }
}
