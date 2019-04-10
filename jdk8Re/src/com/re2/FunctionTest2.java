package com.re2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();
        System.out.println(functionTest2.compute1(5, item -> item + 2, item -> item * item));
        System.out.println(functionTest2.compute2(5, item -> item + 2, item -> item * item));
        System.out.println("------------------------------------------------------------");
        System.out.println(functionTest2.compute3(3, 4, (a, b) -> a + b));
        System.out.println(functionTest2.compute3(5, 6, (a, b) -> a * b));
        System.out.println(functionTest2.compute3(7, 8, (a, b) -> a - b));
        System.out.println(functionTest2.compute3(9, 10, (a, b) -> a / b));

        System.out.println("--------------------------------------------------");

        System.out.println(functionTest2.compute4(8, 1, a -> a + 2, (a, b) -> a * b));
    }

    public int compute1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function2.compose(function1).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function2.andThen(function1).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, Function<Integer, Integer> function, BiFunction<Integer, Integer, Integer> biFunction2) {
        return biFunction2.andThen(function).apply(a, b);
    }
}
