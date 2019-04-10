package com.shengsiyuan.jdk8;

import java.util.function.Predicate;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;//给定一个参数，根据给定条件判断返回true或者是false
        System.out.println(predicate.test("hello1"));
    }
}
