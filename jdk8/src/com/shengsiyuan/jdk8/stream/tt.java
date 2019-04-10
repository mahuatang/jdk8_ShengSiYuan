package com.shengsiyuan.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class tt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list = Optional.ofNullable(list).orElse(new ArrayList<>());

        System.out.println(list);
    }
}
