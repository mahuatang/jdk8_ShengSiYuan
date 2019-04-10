package com.re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(person, person2, person3);

        PersonTest test = new PersonTest();
        List<Person> list2 = test.getPersonByUsername("zhangsan", list);
        list2.forEach(item -> System.out.println(item.getName()));
        System.out.println("-----------------------------------");
        /*list2 = test.getPersonByAge(20, list);
        list2.forEach(item -> System.out.println(item.getAge()));*/
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (age3, list3) ->
        list3.stream().filter(item -> item.getAge() > age3).collect(Collectors.toList());
        list2 = test.getPersonByAge2(20, list, biFunction);
        list2.forEach(item -> System.out.println(item.getAge()));
        System.out.println("*************************************************");
        BiFunction<Integer, List<Person>, List<Person>> biFunction2 = (age3, list3) ->
                list3.stream().filter(item -> item.getAge() <= age3).collect(Collectors.toList());
        list2 = test.getPersonByAge2(20, list, biFunction2);
        list2.forEach(item -> System.out.println(item.getAge()));
    }

    public List<Person> getPersonByUsername(String username, List<Person> list) {
        return list.stream().filter(item -> item.getName().equals(username)).collect(Collectors.toList());
    }

   /* public List<Person> getPersonByAge(int age, List<Person> list) {
        return list.stream().filter(item -> item.getAge() > age).collect(Collectors.toList());
    }*/
   public List<Person> getPersonByAge(int age, List<Person> list) {
       BiFunction<Integer, List<Person>, List<Person>> biFunction = (age2, list2) ->
               list2.stream().filter(item -> item.getAge() > age).collect(Collectors.toList());

       return biFunction.apply(age, list);
   }

   public List<Person> getPersonByAge2(int age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
       return biFunction.apply(age, list);
   }
}
