package com.shengsiyuan.jdk8;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class Student {
    private String name = "zhangsan";

    private int age = 20;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
