package com.re;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();

        System.out.println(test.compute(5, 3, (a, b) -> a + b));
        System.out.println(test.compute(10, 8, (a, b) -> a * b));

        System.out.println("------------------------------------------------");

        System.out.println(test.compute2("zasdfdo", "world",(a, b) -> a.length() - b.length() ));
        System.out.println(test.compute2("zaha", "welcome", Comparator.comparingInt(a -> a.charAt(0))));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String compute2(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
