package com.shengsiyuan.jdk8;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(5, a -> a + 10));
        System.out.println(functionTest.compute(5, a -> a * 10));
        System.out.println(functionTest.compute(5, a -> a - 10));

        System.out.println("-----");

        System.out.println(functionTest.converter(5, a -> a + " wahaha"));
    }

    public int compute(int a,  Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String converter(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
