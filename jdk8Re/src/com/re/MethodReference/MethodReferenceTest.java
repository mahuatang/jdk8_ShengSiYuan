package com.re.MethodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public String getString(Supplier<String> supplier) {return supplier.get() + "test";}
    public String getString2(String str, Function<String, String> function) {return function.apply(str);}

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 20);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 30);
        /*Supplier<Student> studentSupplier = Student::new;
        Student student5 = studentSupplier.get();
        System.out.println(student5);*/

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        /*list.sort((item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
        list.forEach(System.out::println);
        list.sort(Student::computeByName);
        list.forEach(System.out::println);*/

       /* list.sort((item1, item2) -> item1.getScore() - item2.getScore());
        list.forEach(System.out::println);
        list.sort(Student::computeByScore);
        list.forEach(System.out::println);*/

      /* StudentComparator studentComparator = new StudentComparator();
       list.sort(studentComparator::computeByName);
       list.forEach(System.out::println);
       System.out.println("----------------------------------------");
       list.sort(studentComparator::computeByScore);
       list.forEach(System.out::println);*/

      /*list.sort(Student::computeByName2);
      list.forEach(System.out::println);
      System.out.println("-----------------------------------------");
      list.sort(Student::computeByScore);
      list.forEach(System.out::println);*/

      MethodReferenceTest test = new MethodReferenceTest();
      System.out.println(test.getString(String::new));
      System.out.println(test.getString2("world", String::new));
    }
}
