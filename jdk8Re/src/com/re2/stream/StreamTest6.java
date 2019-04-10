package com.re2.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest6 {
    public static void main(String[] args) {
     //   Stream<String> stream = Stream.of(UUID.randomUUID().toString());
        /*Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        stream.findFirst().ifPresent(System.out::println);
        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);*/

        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
    //    System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());
    //    stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).findFirst().ifPresent(System.out::println);
        IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getSum());

 //       System.out.println(stream);
 //       System.out.println(stream.filter(item -> item > 2));
    //    System.out.println(stream.map(item -> 1));


    }
}
