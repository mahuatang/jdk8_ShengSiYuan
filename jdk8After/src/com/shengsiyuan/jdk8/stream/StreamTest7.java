package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");

   //     list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1, item.length())).forEach(System.out::println);
        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1, item.length());
            System.out.println("test");
            return result;
        }).forEach(System.out::println);
    }
}
