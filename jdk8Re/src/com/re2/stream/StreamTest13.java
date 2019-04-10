package com.re2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 20);
        Student student3 = new Student("wangwu", 90, 30);
        Student student4 = new Student("zhangsan", 80, 40);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        list.stream().collect(Collectors.groupingBy(item -> item.getName(), Collectors.counting())).forEach
                ((item1, item2) -> System.out.println(item1 + " " + item2));
        list.stream().collect(Collectors.groupingBy(item -> item.getName(), Collectors.averagingInt(item -> item.getAge()))).
                forEach((item1, item2) -> System.out.println(item1 + " : " + item2));

        list.stream().collect(Collectors.partitioningBy(item -> item.getScore() > 85, Collectors.counting())).
                forEach((item1, item2) -> System.out.println(item1 + " : " + item2));
    }
}
