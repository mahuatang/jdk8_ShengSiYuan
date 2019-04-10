package com.re.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>>{
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
      //  return HashSet::new;
        return () -> new HashSet<>();
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set, item) -> {
            System.out.println("OO: " + set + Thread.currentThread().getName());
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
        System.out.println("finisher invoked");
        return (set) -> {
            Map<T, T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item, item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH));
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        List<String> list = Arrays.asList("hello", "world", "a", "b", "c", "welcome", "d", "e");

        Map<String, String> map = list.stream().collect(new MySetCollector2<>());
        System.out.println(map);
    }
}
