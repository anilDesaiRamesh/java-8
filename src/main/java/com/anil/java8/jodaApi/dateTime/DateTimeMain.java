package com.anil.java8.jodaApi.dateTime;

import java.time.LocalDateTime;

public class DateTimeMain {

    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date and time : " + localDateTime);
        System.out.println("Day of month : " + localDateTime.getDayOfMonth());
        System.out.println("Hour of the day : " + localDateTime.getHour());

    }
}
