package com.re2.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by YURUIThink on 2017/9/23.
 */
public class StreamTest4 {
    public static void main(String[] args) {
       /* Stream<String> stream = Stream.of("hello", "world", "welcome");
        String[] strings = stream.toArray(length -> new String[length]);
        String[] strings2 = stream.toArray(String[]::new);
        Arrays.asList(strings2).forEach(System.out::println);*/

    //   Stream<String> stream = Stream.of("hello", "world", "welcome");
    //   stream.collect(Collectors.toList()).forEach(System.out::println);
    //   System.out.println("-------------------------------------------");
   //    stream.collect(() -> new ArrayList<String>(), (item1, item2) -> item1.add(item2), (item3, item4) -> item3.addAll(item4)).
   //            forEach(System.out::println);
   //    stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll).forEach(System.out::println);

       /* Stream<String> stream = Stream.of("hello", "world", "hello world");
        stream.collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
        stream.collect(Collectors.toList());*/

        /*Stream<String> stream = Stream.of("hello", "world", "hello world");
        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set.getClass());*/

        Stream<String> stream = Stream.of("hello", "world", "hello world");
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
