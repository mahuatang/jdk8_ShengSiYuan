package com.re2.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");

        list.stream().mapToInt(item -> item.length()).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
        list.stream().filter(item -> item.length() == 5).findFirst().ifPresent(System.out::println);
        System.out.println("----------------------------------------");
        list.stream().filter(item -> {
            int length = item.length();
            System.out.println(item);
            if (length == 7) {
                return true;
            }
            return false;
        }).findFirst().ifPresent(System.out::println);
    }
}
