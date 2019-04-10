package com.re;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();

        System.out.println(functionTest2.compute(2, item -> item + 2, item -> item * item));
        System.out.println(functionTest2.compute2(10, item -> item * 100, item -> item + 1));
        System.out.println(functionTest2.compute3(2, 6, (item1, item2) -> item1 * item2));
        System.out.println(functionTest2.compute4(5, 6, (item1, item2) -> item1 + item2, item -> item * item));
    }

    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
