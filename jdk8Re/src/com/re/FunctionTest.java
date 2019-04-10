package com.re;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(5, item -> 2 * item));
        System.out.println(test.compute(6, item -> item + 5));
        System.out.println(test.compute(10, item -> item * item));

        System.out.println("-------------------");
        System.out.println(test.converter(10, item -> 10 + "hello"));

        Function<Integer, Integer> function = item -> item*2 + 1;
        System.out.println(test.compute(3, function));
    }

    public String converter(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }


    public int method1(int a) {
        return 2 * a;
    }

    public int method2(int a) {
        return 5 + a;
    }

    public int method3(int a) {
        return a * a;
    }
}


