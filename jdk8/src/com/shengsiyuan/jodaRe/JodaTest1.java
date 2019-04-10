package com.shengsiyuan.jodaRe;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

public class JodaTest1 {
    public static void main(String[] args) {
        IntList intList = new ArrayIntList();

        intList.add(2);
        intList.add(3);

        intList.stream().forEach(System.out::println);
    }
}
