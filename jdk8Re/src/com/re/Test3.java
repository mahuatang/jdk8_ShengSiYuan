package com.re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {
    interface TheInterface {
        void myMethod();
    }

    interface TheInterface2 {
        void myMethod();
    }

    public static void main(String[] args) {
        TheInterface theInterface = () -> {
            System.out.println("hello world");
        };

        TheInterface2 theInterface2 = () -> System.out.println("张龙 ， 圣思源");

        System.out.println(theInterface.getClass().getInterfaces()[0]);
        System.out.println(theInterface2.getClass().getInterfaces()[0]);

        new Thread(() -> {
            System.out.println("It is a thread");
        }).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
       /* list.forEach(item -> System.out.println(item.toUpperCase()));*/

        List<String> list2 = new ArrayList<>();

        /*list.forEach(item -> list2.add(item.toUpperCase()));
        list2.forEach(item -> System.out.println(item));*/
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));
        System.out.println("*******************************************");
        Function<String, String> function = String::toUpperCase;

        System.out.println(function.getClass().getInterfaces()[0]);
    }
}
