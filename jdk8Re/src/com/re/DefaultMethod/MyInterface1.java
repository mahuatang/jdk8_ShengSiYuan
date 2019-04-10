package com.re.DefaultMethod;

public interface MyInterface1 {
    default void myMethod() {
        System.out.println("MyInterface1");
    }
}
