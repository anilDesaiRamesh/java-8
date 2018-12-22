package com.anil.java8.jodaApi.yearAPI;

import java.time.Year;
import java.util.Scanner;
import java.util.function.Predicate;

public class YearAPIMain {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year value");
        int iUserEnteredYear = scanner.nextInt();
        Year year = Year.of(iUserEnteredYear);

        /*Year is divisble by 4 it is Leap year*/
        Predicate<Year> yearPredicate = year1 -> year1.isLeap();
        if(yearPredicate.test(year))
            System.out.printf("%d Year is Leap Year ",iUserEnteredYear);
        else
            System.out.printf("%d Year is not a Leap Year ",iUserEnteredYear);


    }
}
