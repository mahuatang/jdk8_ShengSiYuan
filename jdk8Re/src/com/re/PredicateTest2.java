package com.re;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest2 {
    public static void main(String[] args) {
        PredicateTest2 predicateTest2 = new PredicateTest2();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = predicateTest2.conditionFilter(list, item -> item%2 == 0);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.conditionFilter(list, item -> item%2 != 0);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.conditionFilter(list, item -> item > 5);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.conditionFilter(list, item -> item < 3);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.condititonFilter2(list, item -> item > 5, item -> item%2 == 0);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.conditionFilter(list, item -> true);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println();
        list2 = predicateTest2.conditionFilter(list, item -> false);
        list2.forEach(item -> System.out.print(item + " "));
        System.out.println("--------------------------------------------------");

        System.out.println(Predicate.isEqual("hello world").test("hello world"));
        System.out.println(Predicate.isEqual(new Person()).test(new Person()));
        System.out.println(predicateTest2.isEquals("hello world").test("hello world"));
        System.out.println(predicateTest2.isEquals(new Date()).test(new Date()));
    }

    public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(item -> predicate.test(item)).collect(Collectors.toList());
    }

    public List<Integer> condititonFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        return list.stream().filter(item -> predicate.and(predicate2).test(item)).collect(Collectors.toList());
    }

    public Predicate<Object> isEquals(Object object) {
        return Predicate.isEqual(object);
    }
}
