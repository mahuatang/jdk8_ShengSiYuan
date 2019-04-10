package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YURUIThink on 2017/2/11.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().map(i -> 2 * i).reduce(10, Integer::sum));
        System.out.println(list.parallelStream().isParallel());

    }
}
