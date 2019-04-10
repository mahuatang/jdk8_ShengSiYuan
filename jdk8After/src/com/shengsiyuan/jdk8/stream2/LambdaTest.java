package com.shengsiyuan.jdk8.stream2;

public class LambdaTest {
    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        new Thread(lambdaTest.r1).start();

        new Thread(lambdaTest.r2).start();
    }
}
