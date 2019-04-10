package com.re2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello welcome");
        list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------------------------");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list2.stream().mapToInt(item -> item * item).collect(ArrayList<Integer>::new, ArrayList<Integer>::add,
                ArrayList<Integer>::addAll).forEach(System.out::println);
        System.out.println("----------------------------");
        List<List<Integer>> list3 = Arrays.asList(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        list3.stream().flatMap(item -> item.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
