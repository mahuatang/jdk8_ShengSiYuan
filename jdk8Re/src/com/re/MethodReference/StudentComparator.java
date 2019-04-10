package com.re.MethodReference;

public class StudentComparator {
    public int computeByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int computeByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
