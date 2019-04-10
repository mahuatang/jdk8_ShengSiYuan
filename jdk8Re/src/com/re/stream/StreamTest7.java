package com.re.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld");

 //       list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);
        list.stream().map(item -> {
            String str = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return str;
        }).forEach(System.out::println);
    }
}
