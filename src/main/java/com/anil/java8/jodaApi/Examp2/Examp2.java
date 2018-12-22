package com.anil.java8.jodaApi.Examp2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Examp2 {

    public static void main(String[] args){

        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date : " + localDate);
        int iDay = localDate.getDayOfMonth();
        int iMonth = localDate.getMonthValue();
        int iYear = localDate.getYear();
        System.out.println("Day : " + iDay);
        System.out.println("Month : " + iMonth);
        System.out.println("Year : " + iYear);
        System.out.println();

        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time : " + localTime);
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int nano = localTime.getNano();
        int second = localTime.getSecond();
        System.out.println("Hour : "+hour );
        System.out.println("Minute : "+minute );
        System.out.println("Seconds : "+second );
        System.out.println("Nano : "+nano );
    }
}
