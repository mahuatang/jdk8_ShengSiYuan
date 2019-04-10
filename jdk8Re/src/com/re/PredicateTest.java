package com.re;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = item -> item.length() > 5;

        System.out.println(predicate.test("hello"));
    }


}
