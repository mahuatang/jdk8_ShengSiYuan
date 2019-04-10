package com.shengsiyuan.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/*
* 代码不全，重在理解
* */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");

    //    return HashSet<T>::new;
        return () -> {
            System.out.println("----------------------");
            return new HashSet<T>();
        };
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set, item) -> {
            System.out.println("accumulator: " + set + Thread.currentThread().getName());
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");

        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finish invoked");

        return set -> {
            Map<T, T> map = new TreeMap<>();
            set.stream().forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "c",
                "d", "e","f","g");
        Set<String> set = new HashSet<>();
        set.addAll(list);

        System.out.println("set: " + set);
        Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
        System.out.println(map);
    }
}
