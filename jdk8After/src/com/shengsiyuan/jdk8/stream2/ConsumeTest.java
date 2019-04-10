package com.shengsiyuan.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumeTest {
    public void test(Consumer<Integer> consume) {
        consume.accept(100);
    }

    public static void main(String[] args) {
        ConsumeTest consumeTest = new ConsumeTest();

        Consumer<Integer> consumer = i -> System.out.println(i + 10);
        IntConsumer intConsumer = i -> System.out.println(i * 10);

        System.out.println(consumer instanceof Consumer);
        System.out.println(consumer instanceof IntConsumer);
        System.out.println(intConsumer instanceof IntConsumer);
        System.out.println(intConsumer instanceof Consumer);

        consumeTest.test(consumer);
    //    consumeTest.test((Consumer<Integer>) intConsumer);

        consumeTest.test(consumer::accept);
        consumeTest.test(intConsumer::accept);
    }
}
