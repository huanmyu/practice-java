package com.huanyu;

import com.huanyu.datetime.ExampleDateTime;

import java.text.ParseException;

public class main {
    public static void main(String[] args) throws ParseException {
        System.out.println("This is my practice java");
        ExampleDateTime example = new ExampleDateTime();
        example.addMonthWithCalendar("2017-04-28", 10);
        example.addMonthWithCalendar("2017-04-29", 10);
        example.addMonthWithCalendar("2017-04-30", 10);
        example.addMonthWithCalendar("2017-11-30", 3);
        example.addMonthWithCalendar(10);
    }
}
