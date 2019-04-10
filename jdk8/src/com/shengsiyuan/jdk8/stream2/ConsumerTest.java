package com.shengsiyuan.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {
    public void test(Consumer<Integer> consumer) {
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        System.out.println(consumer instanceof Consumer);
        System.out.println(intConsumer instanceof IntConsumer);

        consumerTest.test(consumer);//传统面向对象方式，传递的是引用
    //    consumerTest.test((Consumer)intConsumer);//会报错
        consumerTest.test(consumer::accept);//函数式方式，传递的是行为
        consumerTest.test(intConsumer::accept);//函数式方式,传递的是行为
    }
}
