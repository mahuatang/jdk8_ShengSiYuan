package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Created by YURUIThink on 2017/2/11.
 */
public class SteamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        System.out.println("----------------------");
        IntStream.range(3, 8).forEach(System.out::println);

        System.out.println("----------------------");

        IntStream.rangeClosed(3, 8).forEach(System.out::println);


    }
}
