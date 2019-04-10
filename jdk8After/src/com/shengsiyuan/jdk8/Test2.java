package com.shengsiyuan.jdk8;

import java.util.function.Function;

interface MyInterface {
    public String toString();
    public void test();
}

public class Test2 {
    public void hello(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("hello world");
        };

        Test2 test2 = new Test2();
        test2.hello(myInterface);


        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
        System.out.println(myInterface.getClass());

    }
}
