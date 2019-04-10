package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringCompartor {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        Collections.sort(list, (item1, item2) -> {
            return item1.compareTo(item2);
        });
        list.forEach(System.out::println);

    }
}
