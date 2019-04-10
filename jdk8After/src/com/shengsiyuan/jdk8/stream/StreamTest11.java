package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "world hello", "welcom hello welcome", "haha danma");

        /*List<String[]> list2 = */list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);

     //   list2.forEach(item -> Arrays.asList(item).forEach(System.out::println));
    }
}
