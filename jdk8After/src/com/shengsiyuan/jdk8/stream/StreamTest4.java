package com.shengsiyuan.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        String[] stringArray = stream.toArray(length -> new String[length]);
        String[] stringArray2 = stream.toArray(String[]::new);

        Arrays.asList(stringArray).forEach(System.out::println);
        System.out.println("***");
        Arrays.asList(stringArray2).forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        List<String> list = stream.collect(Collectors.toList());
        List<String> list = stream.collect(() -> new ArrayList<>(), (list2, item) -> list2.add(item), (list3, list4) -> list3.addAll(list4));
        List<String> list = stream.collect(LinkedList::new, (list2, item) -> list2.add(item), (list3, list4) -> list3.addAll(list4));

        list.forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set.getClass());
        set.forEach(System.out::println);*/

        Stream<String> stream = Stream.of("hello", "world", "hello world");
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);

    }
}
