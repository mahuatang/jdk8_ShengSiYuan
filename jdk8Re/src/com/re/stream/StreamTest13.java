package com.re.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/16.
 */
public class StreamTest13 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 90, 20);
        Student student2 = new Student("lisi", 80, 30);
        Student student3 = new Student("zhangsan", 20, 40);
        Student student4 = new Student("wangwu", 60, 50);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        list.stream().collect(Collectors.groupingBy(item -> item.getName())).forEach((item1, item2) -> System.out.println(item1 + " : " + item2));
        System.out.println("----------------------------------------------------------------------");
        list.stream().collect(Collectors.groupingBy(item -> item.getAge())).forEach((item1, item2) -> System.out.println(item1 + " : " + item2));
        System.out.println("----------------------------------------------------------------------");
        list.stream().collect(Collectors.groupingBy(item -> item.getName(), Collectors.averagingDouble(item -> item.getScore()))).forEach((item1, item2) -> System.out.println(item1 + " : " + item2));
        System.out.println("--------------------------------------------------------------------------");
        list.stream().collect(Collectors.groupingBy(item -> item.getName(), Collectors.counting())).forEach((item1, item2) -> System.out.println(item1 + " : " + item2));
        System.out.println("-----------------------------------------------------------------------------------------");

        Map<Boolean, List<Student>> map = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() > 36));//.forEach((item1, item2) -> System.out.println(item1 + " : " + item2.get(0)));
        System.out.println(map);
    }
}
