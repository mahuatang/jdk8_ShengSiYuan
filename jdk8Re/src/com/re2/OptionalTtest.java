package com.re2;

import com.re.OptionalTest;

import java.util.Optional;

public class OptionalTtest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        System.out.println("--------------------------------------");
        optional.ifPresent(System.out::println);
        System.out.println("--------------------------------");
        System.out.println(optional.orElse("madan"));
        System.out.println("---------------------------------------------");
        System.out.println(optional.orElseGet(() -> "haha"));
    }
}
