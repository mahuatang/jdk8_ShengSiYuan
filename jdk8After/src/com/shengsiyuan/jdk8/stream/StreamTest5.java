package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello world");
        stream.map(item -> item.toUpperCase()).forEach(System.out::println);
        System.out.println("*********");

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);
        stream2.map(item -> item * item).forEach(System.out::println);
        System.out.println("*********");

        Stream<List<Integer>> stream3 = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6));
        Stream<Integer> stream4 = stream3.flatMap(item -> item.stream()).map(item -> item * item);

        stream4.forEach(System.out::println);
    }
}
