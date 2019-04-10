package com.re.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/9/16.
 */
public class StreamTest11 {
    public static void main(String[] args) {
       /* List<String[]> list = Arrays.asList(new String[]{"hello", "world"}, new String[]{"hello", "haha"}, new String[]{"hello", "yun"});

        list.stream().map(item -> Arrays.stream(item)).collect(Collectors.toList()).forEach(System.out::println);

        Stream<String> stream = list.stream().flatMap(item -> Arrays.stream(item)).distinct().sorted((item1, item2) -> item2.compareTo(item1));

        stream.collect(Collectors.toList()).forEach(System.out::println);*/

        List<String> list = Arrays.asList("haha yun", "wuyun yun", "yun cc");

        list.stream().map(item -> item.split(" ")).flatMap(item -> Arrays.stream(item)).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
