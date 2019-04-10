package com.re2.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        long start = System.nanoTime();

        list.parallelStream().sorted().count();

        long end = System.nanoTime();

        long time = TimeUnit.NANOSECONDS.toMillis(end - start);

        System.out.println(time);
    }
}
