package com.re2;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        System.out.println(functionTest.compute(5, a -> a * 2));
        System.out.println(functionTest.compute(5, a -> a * a));
        System.out.println(functionTest.compute(10, a -> a + 5));

        System.out.println("-----------------------------------------------------");

        System.out.println(functionTest.converter(6, a -> a + "hello"));

        Function<Integer, String> function = a -> a + "hello world";
        System.out.println(function.apply(8));
    }

    public String converter(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }
}
