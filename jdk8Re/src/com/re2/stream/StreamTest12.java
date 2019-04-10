package com.re2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("你好", "hello", "wokao");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        Stream<String> stream = list.stream().flatMap(item -> list2.stream().map(item2 -> item + item2));
        stream.collect(Collectors.toList()).forEach(System.out::println);
    }
}
