package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Created by YURUIThink on 2017/2/13.
 */
public class StreamTest8 {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);//操作顺寻会影响计算结果
    }
}
