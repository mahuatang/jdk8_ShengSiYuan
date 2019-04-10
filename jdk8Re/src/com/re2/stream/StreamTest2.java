package com.re2.stream;

import java.util.stream.IntStream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        IntStream.rangeClosed(3, 8).forEach(System.out::println);

    }
}
