package com.re.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest6 {
    public static void main(String[] args) {
        /*Stream.generate(() -> UUID.randomUUID()).limit(6).forEach(System.out::println); *//*findFirst().ifPresent(System.out::println);*//*
        System.out.println("--------------------------------------------------");
        Stream.generate(UUID.randomUUID()::toString).limit(1).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        Stream.generate(UUID.randomUUID()::toString).findFirst().ifPresent(System.out::println);
        System.out.println("----------------------------------------------------------------");
*/
        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
   //     System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());
  //      System.out.println(stream.filter(item -> item > 2).map(item -> item * 2).skip(2).limit(2).min((item1, item2) -> item2 - item1));
        /*IntSummaryStatistics intSummaryStatistics = stream.filter(item -> item > 2).
                mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());*/

        System.out.println(stream);
     //   System.out.println(stream.filter(item -> item > 2));
        System.out.println(stream.mapToInt(item -> item + 2));
    }
}
