package com.re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------------------------");

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("--------------------------------------------");

        list.forEach(i -> {
            System.out.println(i);
        });

        list.forEach(System.out::println);
    }
}
