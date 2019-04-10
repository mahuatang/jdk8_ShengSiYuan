package com.re2.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list.stream().mapToInt(item -> item * 2).reduce(0, (item1, item2) -> item1 + item2));
    }
}
