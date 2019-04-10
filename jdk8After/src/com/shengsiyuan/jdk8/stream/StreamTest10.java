package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome haha");

     //   list.stream().mapToInt(item -> item.length()).findFirst().ifPresent(System.out::println);

        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println("length: " + length);
            return length;
        }).filter(item -> item > 5).findFirst().ifPresent(System.out::println);
    }

}
