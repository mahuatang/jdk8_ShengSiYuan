package com.re;

import java.util.*;
import java.util.stream.Collectors;

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println(list);*/

        list.sort((item1, item2) -> item1.compareToIgnoreCase(item2));

        System.out.println(list);

    }
}
