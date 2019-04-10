package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("helHEWlo", "popworld", "wElcOme", "sahdfaGDSdsfdasfh", "dsaVVfsad", "a", "b", "cc");

  //      Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
  //      Collections.sort(list, (item1, item2) -> item2.length() - item1.length());

  //      Collections.sort(list, Comparator.comparingInt(String::length).reversed());
  //      Collections.sort(list, Comparator.comparingInt(item -> ((String)item).length()).reversed());

  //      Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
  //      Collections.sort(list, Comparator.comparingInt(item -> 1).reversed());

        System.out.println("-----------------");


 //       list.sort(Comparator.comparingInt(String::length).reversed());
 //       list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) ->
//            item1.toLowerCase().compareTo(item2.toLowerCase())));

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
//........忽略了 太多了
        list.forEach(System.out::println);
    }
}
