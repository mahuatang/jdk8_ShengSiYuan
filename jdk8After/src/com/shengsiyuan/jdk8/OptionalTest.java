package com.shengsiyuan.jdk8;

import java.util.ConcurrentModificationException;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hello");
       // System.out.println(optional);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        optional.ifPresent(item -> System.out.println(item));
        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(() -> "ooooooo"));
    }
}
