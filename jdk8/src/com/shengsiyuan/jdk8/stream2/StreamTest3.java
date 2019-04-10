package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        System.out.println(list.getClass());
        list.stream().forEach(System.out::println);
        list.stream().map(item -> item + "_abc").forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
