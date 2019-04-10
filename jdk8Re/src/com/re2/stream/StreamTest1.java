package com.re2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "welcome");

        String[] strings = new String[]{"hello", "world", "welcome"};

        Stream stream2 = Stream.of(strings);

        Stream stream3 = Arrays.stream(strings);

        List<String> list = Arrays.asList("wokao", "zhanglong");
        Stream<String> stream4 = list.stream();
    }
}
