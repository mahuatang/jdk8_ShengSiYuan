package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Created by YURUIThink on 2017/2/8.
 */
public class StringComparatpr {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

        //有2种形式
        //1.expression o2.compareTo(o1)
        //2.statement {return o2.compareTo(o1);}分号不能省
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
        System.out.println(names);
    }
}
