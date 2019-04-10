package com.re.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("BiConsumer invoked");
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (item1, item2) -> {
            System.out.println("ccccccccccccccccccc");
            item1.addAll(item2);
            return item1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
       // System.out.println("finisher invoked");
      //  return t -> t;
      //  return Function.identity();
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.IDENTITY_FINISH, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);
    }
}