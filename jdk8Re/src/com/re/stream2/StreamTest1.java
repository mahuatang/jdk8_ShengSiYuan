package com.re.stream2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/16.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 86);
        Student student3 = new Student("wangwu", 90);
        Student student4 = new Student("zhaoliu", 60);
        Student student5 = new Student("zhaoliu", 660);

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);
        List<Student> list2 = list.stream().collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        System.out.println(list.stream().collect(Collectors.counting()));
        System.out.println(list.stream().count());
        System.out.println("-------------------------------------------------------");
        list.stream().collect(Collectors.minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        list.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getName))).ifPresent(System.out::println);
        System.out.println(list.stream().collect(Collectors.averagingDouble(Student::getScore)));
        System.out.println(list.stream().collect(Collectors.summarizingDouble(Student::getScore)));

        DoubleSummaryStatistics summaryStatistics = list.stream().collect(Collectors.summarizingDouble(Student::getScore));
        System.out.println("average: " + summaryStatistics.getAverage());
        System.out.println("count: " + summaryStatistics.getCount());
        System.out.println("min: " + summaryStatistics.getMin());
        System.out.println("max: " + summaryStatistics.getMax());
        System.out.println("sum: " + summaryStatistics.getSum());
        System.out.println("----------------------------------------------------------------------");
        System.out.println(list.stream().map(Student::getName).collect(Collectors.joining()));
        System.out.println(list.stream().map(Student::getName).collect(Collectors.joining("**")));
        System.out.println(list.stream().map(Student::getName).collect(Collectors.joining("**", "<begin>", "<end>")));
        System.out.println("-----------------------------------------------------------------------");
        Map<Integer, Map<String, List<Student>>> map = list.stream().collect(Collectors.groupingBy
                (Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(map);
        Map<Boolean, List<Student>> map2 = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() > 80));
        System.out.println(map2);
        Map<Boolean, Map<Boolean, List<Student>>> map3 = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() > 80, Collectors.partitioningBy(item -> item.getScore() > 90)));
        System.out.println(map3);
        Map<Boolean, Long> map4 = list.stream().collect(Collectors.partitioningBy(item -> item.getScore() > 90, Collectors.counting()));
        System.out.println(map4);
        System.out.println("---------------------------------------");
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getName)));
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get))));
     //   list.stream().collect(Collectors.groupingBy(Student::getName));
    }
}
