package com.shengsiyuan.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(() -> UUID.randomUUID().toString());
        stream.findFirst().ifPresent(System.out::println);
        Stream.iterate(50, i -> i + 10).limit(6).forEach(System.out::println);//findFirst().ifPresent(System.out::println);
        System.out.println("****");
        Stream<Integer> stream22 = Stream.iterate(1, item -> item + 2).limit(6);
        stream22.forEach(System.out::println);
        IntSummaryStatistics intSummaryStatistics = Stream.iterate(2, item -> item * 2).limit(10).filter(item -> item > 2).mapToInt(item -> 2).summaryStatistics();

    }
}
