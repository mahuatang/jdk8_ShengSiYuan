package com.shengsiyuan.jdk8;

import java.util.Optional;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

//        if (optional.isPresent()) {//去除isPresent会有警告，形成一种套路，不推荐
//            System.out.println(optional.get());
//        }
        optional.ifPresent(item -> System.out.println(item));//推荐的Optional使用方式
        System.out.println("---------------------------------------");
        System.out.println(optional.orElse("world"));//如果没有值就用world
        System.out.println("-------------------------");
        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
