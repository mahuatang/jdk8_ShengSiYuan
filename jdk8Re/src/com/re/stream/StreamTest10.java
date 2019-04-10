package com.re.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YURUIThink on 2017/9/16.
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().mapToInt(item -> item.length()).filter(item -> item == 6).findFirst().ifPresent(System.out::println);
        System.out.println("---------------------------------------------------------");
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(item -> item == 15).findFirst().ifPresent(System.out::println);


    }
}
