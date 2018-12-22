package com.anil.java8.jodaApi.Examp1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Examp1 {

    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        System.out.println("Current date is : " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Current local time is : "+localTime);
    }
}
