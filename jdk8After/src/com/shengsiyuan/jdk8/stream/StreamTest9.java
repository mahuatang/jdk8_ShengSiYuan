package com.shengsiyuan.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();



        for(int i= 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }
        long startTime = System.nanoTime();

        list.stream().sorted().count();

        long endTime = System.nanoTime();

        long millils =  TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序话费的时间：" + millils);
    }
}
