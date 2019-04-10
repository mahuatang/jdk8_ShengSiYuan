package com.shengsiyuan.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80, 20);
        Student student2 = new Student("lisi", 80, 30);
        Student student3 = new Student("wangwu", 90, 20);
        Student student4 = new Student("zhangsan", 10, 50);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy(item -> {return item.getName();}));
        Map<Integer, List<Student>> map2 = list.stream().collect(Collectors.groupingBy(item -> {return item.getScore();}));
        Map<Boolean, List<Student>> map3 = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() < 10));
        Map<String, Long> map4 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        Map<String, Double> map5 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));

        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);
        System.out.println(map5);
    }
}
