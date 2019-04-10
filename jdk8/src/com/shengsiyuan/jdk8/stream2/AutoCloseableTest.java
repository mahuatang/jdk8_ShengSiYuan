package com.shengsiyuan.jdk8.stream2;

/**
 * Created by YURUIThink on 2017/9/28.
 */
public class AutoCloseableTest implements AutoCloseable{
    public void doSomething() {
        System.out.println("doSomething invoked");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close invoked");
    }

    public static void main(String[] args) throws Exception{
        try(AutoCloseableTest autoCloseableTest = new AutoCloseableTest()) {
            autoCloseableTest.doSomething();
        }
    }

}
