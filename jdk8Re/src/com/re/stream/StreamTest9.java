package com.re.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StreamTest9 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>(5000000);

        for(int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }*/

        System.out.println("开始排序");
        long a = System.nanoTime();
        long  b = System.currentTimeMillis();
        System.out.println("a: " + a);
        System.out.println("a2: " + TimeUnit.NANOSECONDS.toMillis(a));
        System.out.println("b: " + b);
        System.out.println(a/b);
        long begin = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        /*list.parallelStream().sorted().count();*/
        long end = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
       // System.out.println(end - begin);
    }
}
