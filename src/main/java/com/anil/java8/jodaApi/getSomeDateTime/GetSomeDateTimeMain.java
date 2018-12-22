package com.anil.java8.jodaApi.getSomeDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class GetSomeDateTimeMain {

    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.of(1987, 4,29,6,30,00,100000);
        System.out.println(localDateTime);
    }
}
