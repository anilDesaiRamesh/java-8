package com.anil.java8.biPredicate.EvenNumberMain;

import java.util.function.BiPredicate;

public class EvenNumberCheckMain {

    public static void main(String[] args){

        BiPredicate<Integer,Integer> biPredicate = (integer, integer2) -> (integer+integer2) % 2==0;
        int iNum = 15;
        int iNum2 = 20;
        if(biPredicate.test(iNum,iNum2))
            System.out.println("Even Numer");
        else
            System.out.println("Odd Number");

    }
}
