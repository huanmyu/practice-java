package com.huanyu.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ExampleDateTime {
    /*
     * 添加月份计算结果
     */
    public void addMonth(int month) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        int day = month * 30;
        LocalDate resultDate = currentDate.plusDays(day);
        System.out.println(resultDate);
    }

    /*
    * 添加月份计算结果
    */
    public void addMonth(String date, int month) {
        LocalDate currentDate = LocalDate.parse(date);
        System.out.println(currentDate);
        LocalDate resultDate = currentDate.plus(10, ChronoUnit.MONTHS);
        System.out.println(resultDate);
    }

    public void addMonthWithCalendar(int month) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        String dateString = df.format(new Date());
        Date computeDate = df.parse(dateString);
        cal.setTime(computeDate);
        int countDay = 0;
        for(int i = 0; i < month; i++) {
            cal.add(Calendar.MONTH, 1);
            int num2 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            countDay = countDay + num2;
        }

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println(countDay);
        LocalDate resultDate = currentDate.plusDays(countDay);
        System.out.println(resultDate);
    }

    public void addMonthWithCalendar(String date, int month) throws ParseException {
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        Date computeDate = df.parse(date);
        cal.setTime(computeDate);
        int countDay = 0;
        for(int i = 0; i < month; i++) {
            cal.add(Calendar.MONTH, 1);
            int num2 = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            countDay = countDay + num2;
        }

        System.out.println(countDay);
        LocalDate currentDate = LocalDate.parse(date);
        LocalDate resultDate = currentDate.plusDays(countDay);
        System.out.println(resultDate);
    }

    public void addMonthWithCalendarUse30(String date, int month) throws ParseException {
        System.out.println(date);
        int countDay = month * 30;
        System.out.println(countDay);
        LocalDate currentDate = LocalDate.parse(date);
        LocalDate resultDate = currentDate.plusDays(countDay);
        System.out.println(resultDate);
    }
}
