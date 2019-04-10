package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(2, 3, (a, b) -> (Integer)a + (Integer)b));
        System.out.println(binaryOperatorTest.compute(3, 4, (a, b) -> (Integer)a * (Integer)b));

        System.out.println("----------");

        System.out.println(binaryOperatorTest.getShort("hello0", "worldoo", (a, b) -> ((String)a).length() - ((String)b).length()));
        System.out.println(binaryOperatorTest.getShort("zello0", "worldoo", (a, b) -> ((String)a).charAt(0) - ((String)b).charAt(0)));

    }

    public Object compute(Integer a, Integer b, BinaryOperator binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public Object getShort(String obj1, String obj2, Comparator comparator) {
        return BinaryOperator.minBy(comparator).apply(obj1, obj2);
    }
}
