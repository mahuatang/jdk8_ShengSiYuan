package com.re2.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");

        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);
    }
}
