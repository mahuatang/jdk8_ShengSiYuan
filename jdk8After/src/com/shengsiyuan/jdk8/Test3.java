package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;

interface TheInterface {
    public void test();
}

interface TheInterface2 {
    public void test();
}

public class Test3 {
    public static void main(String[] args) {
        /*TheInterface theInterface = () -> {};
        TheInterface2 theInterface2 = () -> {};

        System.out.println(theInterface.getClass().getInterfaces()[0]);
        System.out.println(theInterface2.getClass().getInterfaces()[0]);

        new Thread(() -> {
            System.out.println("hello world");
        }).start();*/
        System.out.println("-------");
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.forEach(item -> item = "a");
        list.forEach(item -> System.out.println(item));
        list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
    }
}
