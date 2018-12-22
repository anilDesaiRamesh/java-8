package com.anil.java8.jodaApi.incrementDate;

import java.time.LocalDateTime;

public class IncrementDateMain {

    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current Date time : " + localDateTime);

        LocalDateTime incrementedDate = localDateTime.plusMinutes(6);
        System.out.println("Incremented date time : " + incrementedDate);

        LocalDateTime decrementedDate = localDateTime.minusMonths(6);
        System.out.println("Decremented date time : " + decrementedDate);

        System.out.println("Incremented date by 1 : " +localDateTime.plusDays(1));

    }
}
