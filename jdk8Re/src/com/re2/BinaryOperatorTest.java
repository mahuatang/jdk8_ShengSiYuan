package com.re2;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(3, 5, (a, b) -> a + b));
        System.out.println(binaryOperatorTest.compute(3, 5, (a, b) -> a - b));
        System.out.println("------------------------------------------------------------");
        System.out.println(binaryOperatorTest.getShort("helloo", "world", (a, b) -> a.length() -b.length()));
        System.out.println(binaryOperatorTest.getShort("hello", "world", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> operator) {
        return BinaryOperator.maxBy(operator).apply(a, b);
    }
}
