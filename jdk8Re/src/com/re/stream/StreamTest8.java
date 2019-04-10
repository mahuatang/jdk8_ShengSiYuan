package com.re.stream;

import java.util.stream.IntStream;

public class StreamTest8 {
    public static void main(String[] args) {
        IntStream.iterate(0, item -> (item + 1) % 2).limit(10).distinct().forEach(System.out::println);
    }
}
