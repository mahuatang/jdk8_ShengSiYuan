package com.re.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hello", "world", "helloworld");
        list1.stream().map(item -> item.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        List<List<Integer>> list3 = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(6, 8));
        list3.stream().flatMap(item -> item.stream()).map(item -> item * 2).collect(Collectors.toList()).forEach(System.out::println);
    }
}
