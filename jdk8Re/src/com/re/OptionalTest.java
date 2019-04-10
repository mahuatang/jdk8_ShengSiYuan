package com.re;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        /*if (optional.isPresent()) {
            System.out.println(optional.get());
        }*/

        optional.ifPresent(item -> System.out.println("wahaha"));

        System.out.println(optional.orElse("mada"));

        System.out.println(optional.orElseGet(() -> "jjkk"));
    }


}
