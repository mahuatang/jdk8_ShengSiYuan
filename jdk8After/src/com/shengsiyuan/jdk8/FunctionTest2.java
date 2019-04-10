package com.shengsiyuan.jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();
        Function<Integer, Integer> function1 = a -> a * 10;
        Function<Integer, Integer> function2 = a -> a + 1;

        System.out.println(functionTest2.compute(10, function1, function2));
        System.out.println(functionTest2.compute2(10, function1, function2));

        System.out.println("----");

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(functionTest2.compute3(8, 8, biFunction, function1));

    }

    public int compute(int a, Function<Integer, Integer> function, Function<Integer, Integer> function2) {
        return function.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function, Function<Integer, Integer> function2) {
        return function.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
