package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by YURUIThink on 2017/2/8.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        for (int i = 0; i < list.size(); ++i)
//        {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println("----------------------------");
//
//        for (Integer i : list){
//            System.out.println(i);
//        }
//
//        System.out.println("--------------------------------");

        list.forEach(i -> {
            System.out.println(i);
        });

        list.forEach(System.out::println);//通过方法引用的形式来去创建函数式接口的实例

        System.out.println("-----------------------------------");
    }
}
