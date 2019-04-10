package com.shengsiyuan.jdk8;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class Person {
    private String username;

    private int age;

    public  Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
