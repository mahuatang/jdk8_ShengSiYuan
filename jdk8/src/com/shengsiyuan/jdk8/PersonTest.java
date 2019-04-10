package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by YURUIThink on 2017/2/9.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();
//        List<Person> personList = test.getpersonbyUsername("zhangsan", persons);
//        personList.forEach(person -> System.out.println(person.getUsername()));
//        List<Person> personList = test.getPersonByAge(20, persons);
 //       personList.forEach(person -> System.out.println(person.getAge()));
        List<Person> personList = test.getPersonsByAge2(20, persons, (age, personResult) -> {
           return personResult.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });

        personList.forEach(person -> System.out.println(person.getAge()));

        System.out.println("-----------------------------------");

        List<Person> personList2 = test.getPersonsByAge2(20, persons, (age, personResult) -> {
            return personResult.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList());
        });

        personList2.forEach(person -> System.out.println(person.getAge()));
    }

    public List<Person> getpersonbyUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(username)).
                collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> {
            return personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonsByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }

    /*一种不用流比较差的写法
    List<Person> list3 = test.getPersonByUsername(list, item -> {
            List<Person> list2 = new ArrayList<>();
            item.forEach(item2 -> {
                if(item2.getName().equals("zhangsan")) {
                    list2.add(item2);
                }
            });
            return list2;
        });

        list3 = test.getPersonByAge(list, item -> {
           List<Person> list2 = new ArrayList<>();
           item.forEach(item2 -> {
               if (item2.getAge() > 25) {
                   list2.add(item2);
               }
           });
           return list2;
        });*/
    /*public List<Person> getPersonByUsername(List<Person> list, Function<List<Person>, List<Person>> function) {
        return function.apply(list);
    }

    public List<Person> getPersonByAge(List<Person> list, Function<List<Person>, List<Person>> function) {
        return function.apply(list);
    }*/
}
