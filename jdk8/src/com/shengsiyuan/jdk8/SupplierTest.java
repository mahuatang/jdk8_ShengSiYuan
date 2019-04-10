package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());

    }
}
