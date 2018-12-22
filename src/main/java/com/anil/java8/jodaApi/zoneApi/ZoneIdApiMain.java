package com.anil.java8.jodaApi.zoneApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdApiMain {

    public static void main(String[] args){

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My Time Zone : " + zoneId);

        /*Custom Zone id*/
        ZoneId customZoneId = ZoneId.of("Asia/Calcutta");
        ZonedDateTime customZonedDateTime = ZonedDateTime.now(customZoneId);
        System.out.println("Current Date and time in India : "+customZonedDateTime);
    }
}
