package com.re.stream;

import java.util.stream.IntStream;

public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.range(3, 5).forEach(System.out::println);
        System.out.println("----------------------------------");
        IntStream.rangeClosed(3, 6).forEach(System.out::println);
        System.out.println("--------------------------------------");
        IntStream stream1 = IntStream.of(new int[]{1, 2});
        IntStream stream2 = IntStream.of(new int[]{5, 6, 7});

        IntStream.concat(stream1, stream2).forEach(System.out::println);
    }
}
