package com.shengsiyuan.joda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Date date = new Date();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH");
        System.out.println(LocalDate.parse("2017-04-21",dateTimeFormatter));
    //    Dateutils
      //  LocalDate localDate2 = LocalDate.of()
    }
}
