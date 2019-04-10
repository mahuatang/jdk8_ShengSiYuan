package com.shengsiyuan.jdk8.stream2;

import java.util.stream.Stream;

public class LambdaTest {
    Runnable r1 = () -> System.out.println(this);//和外层的作用域是一个作用域

    Runnable r2 = new Runnable() {//会开辟新的作用域
        @Override
        public void run() {
            System.out.println(this);//this表示匿名类对应的对象
        }//生成了实现runnable接口的匿名类
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();

        System.out.println("-------------------------");

        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();
    }
}
