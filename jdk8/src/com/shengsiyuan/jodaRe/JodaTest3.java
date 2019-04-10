package com.shengsiyuan.jodaRe;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JodaTest3 {
    public static Date converterUTC2Date(String utcDate) {
        DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return dateTime.toDate();
    }

    public static String converterDate2UTC(Date date) {
        DateTime dateTime = new DateTime(date, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String converterDate2LocalDateByDateFormatter(Date date, String dateFormatter) {
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(dateFormatter);
    }

    public static void main(String[] args) {
        System.out.println(converterUTC2Date("2014-11-04T09:22:54.876Z"));
        System.out.println(converterDate2UTC(new Date()));
        System.out.println(converterDate2LocalDateByDateFormatter(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }
}
