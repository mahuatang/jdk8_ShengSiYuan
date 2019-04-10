package com.re.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 10);
        int sum = list.stream().map(item -> item * 2).reduce(0, (item1, item2) -> item1 + item2);
        System.out.println(sum);
    }
}
