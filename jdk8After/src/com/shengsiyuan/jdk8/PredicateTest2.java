package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2 predicateTest2 = new PredicateTest2();
        predicateTest2.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("------");
        predicateTest2.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("------");
        predicateTest2.conditionFilter(list, item -> item > 5);
        System.out.println("------");
        predicateTest2.conditionFilter(list, item -> item < 2);

        System.out.println("***********");

        predicateTest2.conditionFilter2(list, item -> item > 5, item -> item %2 == 0);


   //     System.out.println(predicateTest2.isEquals("hello").test("hello"));
        System.out.println(predicateTest2.isEquals(new Date()).test(new Date()));



    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(item -> predicate.test(item)).forEach(System.out::print);
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
       list.stream().filter(item -> predicate.or(predicate2).test(item)).forEach(System.out::println);
    }

    public Predicate<Date> isEquals(Object object) {
        return Predicate.isEqual(object);
    }
}