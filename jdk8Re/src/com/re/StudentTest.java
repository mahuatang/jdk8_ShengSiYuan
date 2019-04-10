package com.re;

import java.util.function.Supplier;

public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student();

        System.out.println(studentSupplier.get().getName());
        System.out.println(studentSupplier.get().getAge());

        Supplier<Student> studentSupplier2 = Student::new;

        System.out.println(studentSupplier2.get().getName());
    }
}
