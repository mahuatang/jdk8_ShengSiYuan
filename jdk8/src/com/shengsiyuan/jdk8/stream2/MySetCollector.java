package com.shengsiyuan.jdk8.stream2;

import sun.security.krb5.Config;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/*
* 代码不全，重在理解
* */
public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulatro invoked!");
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            System.out.println("*************************************");
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked");
     //   return t -> t;
    //    return Function.identity();
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristicc invoked");
        return Collections.unmodifiableSet(EnumSet.of(UNORDERED, CONCURRENT, Characteristics.IDENTITY_FINISH));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "aa", "cc");
        Set<String> set = list.stream().collect(new MySetCollector<>());

        System.out.println(set);
    }
}
