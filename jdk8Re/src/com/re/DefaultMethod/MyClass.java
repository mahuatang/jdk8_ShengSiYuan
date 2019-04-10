package com.re.DefaultMethod;

public class MyClass extends MyInterfaceImpl implements MyInterface2 {
    @Override
    public void myMethod() {
        System.out.println("wyunhuhu");
        MyInterface2.super.myMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
