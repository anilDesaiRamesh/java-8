package com.anil.java8.predicate.exmp1;

import java.util.function.Predicate;

public class PrediCateMain {

    public static void main(String[] args){

        Predicate<Integer> predicate = i -> i>10;
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(5));
    }
}
