package com.shengsiyuan.jdk8.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 20);
        Student student2 = new Student("lisi", 60);
        Student student3 = new Student("wangwu", 30);

        List<Student> list = Arrays.asList(student, student2, student3);
    //    list.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
    //    list.sort(Student::compareStudentByName2);

    //    list.sort((item1, item2) -> item2.getScore() - item1.getScore());
    //    list.sort(Student::compareStudentByScore2);

    //    list.sort(student::compareStudentByName3);

    //    list.sort(student::compareStudentByScore3);
        list.sort(Student::compareStudentByScore);

        list.forEach(item -> System.out.println(item.getName() + " : " + item.getScore()));


    }
}
