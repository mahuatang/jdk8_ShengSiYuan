package com.shengsiyuan.defaultMethod;

/**
 * Created by YURUIThink on 2017/2/11.
 */
public class MyClass extends MyInterface1Impl implements MyInterface2 {//实现类的优先级比接口的优先级更高
//    @Override
//    public void myMethod() {
//        System.out.println("MyClass");
//        MyInterface2.super.myMethod();
//    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
