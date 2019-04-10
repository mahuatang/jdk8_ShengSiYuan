package com.shengsiyuan.jdk8;

/**
 * Created by YURUIThink on 2017/2/8.
 */

@FunctionalInterface
interface MyInterface {
    void test();
    String toString();
}

public class Test2 {
    public void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        test2.myTest(() -> System.out.println("mytest"));

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };

        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
