package com.re2.stream;

import java.util.stream.IntStream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest8 {
    public static void main(String[] args) {
        IntStream.iterate(0, item -> (item + 1)% 2).limit(6).distinct().forEach(System.out::println);
    }
}
