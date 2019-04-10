package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Hi", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        List<String> ha = list.stream().flatMap(item -> list2.stream().map(item2 -> item + " : " + item2)).collect(Collectors.toList());
        /*list.stream().map(item -> list2.stream().map(item2 -> item + " : " + item2)).forEach(System.out::println);*/
        ha.forEach(System.out::println);
    }
}
