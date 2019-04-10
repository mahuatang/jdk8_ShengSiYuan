package com.re2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "hello welcome", "welcome world haha", "hello world");

        /*list.stream().map(item -> item.split(" ")).distinct().map(item -> Arrays.asList(item)).
                forEach(System.out::println);*/
        Stream<String> stream = list.stream().map(item -> item.split(" ")).flatMap(item -> Arrays.asList(item).stream());//distinct().forEach(System.out::println);
        stream.distinct().forEach(System.out::println);
    }
}
