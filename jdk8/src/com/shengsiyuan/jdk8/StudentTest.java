package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();//不接受参数，返回一个结果
        System.out.println(supplier.get().getName());
        System.out.println("-----------------");
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
    }
}
