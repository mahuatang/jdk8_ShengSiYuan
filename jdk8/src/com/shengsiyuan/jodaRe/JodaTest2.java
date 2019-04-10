package com.shengsiyuan.jodaRe;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class JodaTest2 {
    public static void main(String[] args) {
        DateTime dateTime = DateTime.now();
        DateTime tommorow = dateTime.plusDays(1);

        System.out.println(dateTime.toString("yy-MM-dd"));
        System.out.println(tommorow.toString("yy-MM-dd"));

        System.out.println("----------------------------------------------");

        DateTime d1 = dateTime.withDayOfMonth(1);
        System.out.println(d1.toString("yy-MM-dd"));

        System.out.println("------------------------------------------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println("-------------------------------------------------");

        localDate = localDate.plusMonths(6).dayOfMonth().withMaximumValue();

        System.out.println(localDate);

        System.out.println("------------------------------------------------");

        DateTime dateTime2 = new DateTime();

        dateTime2 = dateTime2.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();

        System.out.println(dateTime2.toString("yyyy-MM-dd"));
    }
}
