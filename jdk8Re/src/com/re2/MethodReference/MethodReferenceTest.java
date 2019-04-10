package com.re2.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public String getString(Supplier<String> supplier) { return supplier.get() + "test";}
    public String getString2(String t, Function<String, String> function) { return function.apply(t);}

    public static void main(String[] args) {
        Student student = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 30);
        Student student4 = new Student("zhaoliu", 20);

        List<Student> list = Arrays.asList(student, student2, student3, student4);

        /*list.sort((item1, item2) -> Student.getStudentByScore(item1, item2));
        list.forEach(item -> System.out.println(item.getScore()));*/
        System.out.println("------------------------------------------");
        /*list.sort(Student::getStudentByScore);
        list.forEach(item -> System.out.println(item.getScore()));*/
        /*list.sort((item1, item2) -> Student.getStudentByName(item1, item2));
        list.forEach(item -> System.out.println(item.getName()));*/
        System.out.println("---------------------------------------------");
        /*list.sort(Student::getStudentByName);
        list.forEach(item -> System.out.println(item.getName()));*/
        System.out.println("--------------------------------------------------");

        StudentComparator studentComparator = new StudentComparator();

       /* list.sort((item1, item2) -> studentComparator.getStudentByName(item1, item2));
        list.forEach(item -> System.out.println(item.getName()));
        list.sort(studentComparator::getStudentByName);
        list.forEach(item -> System.out.println(item.getName()));*/
        System.out.println("---------------------------------------");
        /*list.sort((item1, item2) -> studentComparator.getStudentByScore(item1, item2));
        list.forEach(item -> System.out.println(item.getScore()));
        list.sort(studentComparator::getStudentByScore);
        list.forEach(item -> System.out.println(item.getScore()));*/

        /*list.sort(Student::getStudentByName);
        list.forEach(item -> System.out.println(item.getName()));
        list.sort(Student::getStudentByScore);
        list.forEach(item -> System.out.println(item.getScore()));*/
        System.out.println("---------------------------------------------------------");

        List<String> cities = Arrays.asList("wuhan", "zhangsan", "qingdao", "chongqing", "beijing", "sahgnhai");
    //    Collections.sort(cities, (city1, city2) -> city1.compareTo(city2));
    //    Collections.sort(cities, String::compareTo);
    //    cities.forEach(System.out::println);

        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));
        System.out.println(test.getString2("world", item -> item + " hwllo"));
    }
}
