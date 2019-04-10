package com.re2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");

        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);*/
        System.out.println("-----------------------------------------------------------");
        list.sort((item1, item2) -> item1.compareTo(item2));
        System.out.println(list);
    }
}
