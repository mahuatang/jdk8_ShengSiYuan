package com.shengsiyuan.jdk8.testFiles;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = time.plusHours(3).plusMinutes(20);

        UUser uUser = new UUser("zhangsan", time);
        uUser.setA(1);
        UUser uUser2 = new UUser("lisi", time2);
        uUser.setA(2);

        List<UUser> list = new ArrayList<>();
        list.add(uUser);
        list.add(uUser2);


       // list.forEach(item -> System.out.println(item.getDate()));

        System.out.println(list.get(0).getDate().isBefore(list.get(1).getDate()));

        list = list.stream().sorted((item1, item2) -> -item1.getDate().compareTo(item2.getDate())).collect(Collectors.toList());

        list.forEach(item -> System.out.println(item.getDate()));

        System.out.println("=========");

        Collections.sort(list, new Comparator<UUser>() {
            @Override
            public int compare(UUser o1, UUser o2) {
                if(o1.getDate().isBefore(o2.getDate())){
                    System.out.println("wokao");
                    return 1;
                } else if(o1.getDate().equals(o2.getDate())){
                    return 0;
                } else {
                    System.out.println("madan");
                    return -1;
                }
            }
        });



       // list = list.stream().sorted((item1, item2) -> -item1.getDate().compareTo(item2.getDate())).collect(Collectors.toList());


        list.forEach(item -> System.out.println(item.getDate()));
    }
}

class UUser {
    private String name;
    private LocalTime date;
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public UUser(String name, LocalTime date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }
}
