package com.re2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();

        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(person1, person2, person3);
       /* List<Person> list2 = personTest.getPersonByUserName("zhagnsan", list);
        System.out.println(list2);
        List<Person> list3 = personTest.getPersonByAge(25, list);
        System.out.println(list3);*/

        List<Person> list4 = personTest.getPersonByAge2(25, list, (item, listA) -> listA.stream().
                filter(item2 -> item2.getAge() > 25).collect(Collectors.toList()));

        System.out.println(list4);

        System.out.println("---------------------------------------------------------------------------");

        List<Person> list5 = personTest.getPersonByAge2(25, list, (item, listA) -> listA.stream().
                filter(item2 -> item2.getAge() < 25).collect(Collectors.toList()));

        System.out.println(list5);

    }

    public List<Person> getPersonByUserName(String name, List<Person> list) {
        return list.stream().filter(item -> item.getName().equalsIgnoreCase("zhangsan")).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> list) {
        return list.stream().filter(item -> item.getAge() > 25).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge2(int age, List<Person> list, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, list);
    }
}
