package com.re.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/16.
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hello", "你好", "Good Morinning");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");

        list1.stream().flatMap(item1 -> list2.stream().map(item2 -> item1 + " : " + item2))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
