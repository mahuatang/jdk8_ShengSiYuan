package com.shengsiyuan.defaultMethod;

/**
 * Created by YURUIThink on 2017/2/11.
 */
public interface MyInterface1 {
    default  void myMethod() {
        System.out.println("MyInterface1");
    }

}
