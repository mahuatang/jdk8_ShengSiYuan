package com.re.stream;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        String[] strs = stream.toArray(length -> new String[length]);

        Stream<String> stream2 = Stream.of(strs);
        String[] strs2 = stream2.toArray(String[]::new);

        Arrays.asList(strs).forEach(item -> System.out.println(item));
        System.out.println("------------------------------");
        Arrays.asList(strs2).forEach(System.out::println);
        System.out.println("-------------------------------");*/

        Stream<String> stream3 = Stream.of("hello", "world", "hello world");

       // List<String> list = stream3.collect(Collectors.toList());
       // List<String> list2 = stream3.collect(() -> new ArrayList<>(), (item1, item2) -> item1.add(item2),
       //         (item3, item4) -> item3.add All(item4));
        /*List<String> list3 = stream3.collect(ArrayList::new, List::add, List::addAll);
        System.out.println("-----------------------------");
        list3.forEach(System.out::println);*/
        /*List<Integer> list = new ArrayList<Integer>();
        StreamTest4 streamTest4 = new StreamTest4();
        list.forEach(System.out::println);

        streamTest4.method(list, 99, (cc, cc2) -> cc.add(cc2));
        list.forEach(System.out::println);*/

        System.out.println("--------------------------------------------------------------");

        Stream<String> stream = Stream.of("hello", "world", "hello world");
        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);
        System.out.println("*********************************************************");
        Stream<String> stream4 = Stream.of("adf", "zhanglong", "wuha", "thk", "helloworld");
        Set<String> set = stream4.collect(Collectors.toCollection(HashSet::new));
        set.forEach(System.out::println);

        Stream<String> stream6 = Stream.of("wuha", "niqiang", "yunda");
        String value = stream6.collect(Collectors.joining());
        System.out.println(value);
    }

    /*public void method(List<Integer> list, Integer a, BiConsumer<List, Integer> biConsumer) {
        biConsumer.accept(list, a);
    }*/
}
