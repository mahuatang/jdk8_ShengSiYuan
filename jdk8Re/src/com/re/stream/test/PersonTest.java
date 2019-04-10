package com.re.stream.test;

import java.util.Arrays;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 10);
        Person person2 = new Person("lisi", 20);
        Person person3 = new Person("wangwu", 16);
        Person person4 = new Person("zhaoliu", 8);
        Person person5 = new Person("zhangsan", 10);
        Person person6 = new Person("wangwudsf", 16);
        Person person7 = new Person("zhaoliu", 8);
        Person person8 = new Person("lisi", 20);
        Person person9 = new Person("wangdsafwu", 16);
        Person person10 = new Person("zhdsfaaoliu", 8);
        Person person11 = new Person("zhdsafaoliu", 8);
        Person person12 = new Person("zhdsfaoliu", 8);

        List<Person> list = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8);

        System.out.println(list.stream().map(item -> item.getName()).distinct().sorted().count());
        list.stream().map(item -> item.getName()).distinct().sorted((item1, item2) -> item2.compareToIgnoreCase(item1)).forEach(System.out::println);
    }
}
