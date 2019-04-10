package com.re2;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        PredicateTest2 predicateTest2 = new PredicateTest2();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        /*predicateTest2.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("--------------------------");
        predicateTest2.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("--------------------------");
        predicateTest2.conditionFilter(list, item -> item > 5);
        System.out.println("---------------------------");
        predicateTest2.conditionFilter(list, item -> item < 3);
        System.out.println("----------------------------");
        predicateTest2.conditionFilter(list, item -> true);
        System.out.println("----------------------------");
        predicateTest2.conditionFilter(list, item -> false);
        System.out.println("-----------------------------");*/

     //   predicateTest2.conditionFilter2(list, item -> item > 5, item  -> item > 8, item -> item == 2);
        System.out.println(predicateTest2.isEquals(new Date()).test(new Date()));
        System.out.println(predicateTest2.isEquals(new String("wokao")).test(new String("wokao")));

    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(item -> {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        });
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicateTest, Predicate<Integer> predicateTest2, Predicate<Integer> predicateTes3) {
        list.forEach(item -> {
            if (predicateTest.and(predicateTest2).and(predicateTes3).test(item)) {
                System.out.println(item);
            }
        }
        );
    }

    public Predicate<Date> isEquals(Date date) {
        return Predicate.isEqual(date);
    }

    public Predicate<String> isEquals(String str) {
        return Predicate.isEqual(str);
    }
}
