package com.re.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "helloworld");

        String[] array = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(array);
        Stream stream3 = Arrays.stream(array);

        List<String> list = Arrays.asList("hello", "world", "helloworld");
        Stream stream4 = list.stream();
        stream4.forEach(System.out::println);
    }
}
