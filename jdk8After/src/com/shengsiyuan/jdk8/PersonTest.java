package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        PersonTest test = new PersonTest();

        Person p1 = new Person("zhangsan", 1);
        Person p2 = new Person("lisi", 2);
        Person p3 = new Person("wangwu", 3);

        List<Person> list = Arrays.asList(p1, p2, p3);

        List<Person> list2 = test.getPersonByUsername("zhangsan", list);
        list2.forEach(item -> System.out.println(item.getName() + " : " + item.getAge()));
        System.out.println("---------");
        List<Person> list3 = test.getPersonByAge(1, list);
        list3.forEach(item -> System.out.println(item.getName() + " : " + item.getAge()));

        System.out.println("***********");

        test.getPersonByAge2(2, list, (age2, list22) -> list22.stream().filter(item -> item.getAge() > age2)
                .collect(Collectors.toList())).forEach(item -> System.out.println(item.getName() + " : " + item.getAge()));
        System.out.println("------------");
        test.getPersonByAge2(2, list, (age2, list22) -> list22.stream().filter(item -> item.getAge() < age2)
                .collect(Collectors.toList())).forEach(item -> System.out.println(item.getName() + " : " + item.getAge()));

    }

    public List<Person> getPersonByUsername(String username, List<Person> list) {
        return list.stream().filter(item -> item.getName().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> list) {
        return list.stream().filter(item -> item.getAge() > age).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge2(int age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, list);
    }
}
