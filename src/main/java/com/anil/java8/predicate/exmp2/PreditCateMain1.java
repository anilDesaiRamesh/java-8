package com.anil.java8.predicate.exmp2;

import java.util.function.Predicate;

public class PreditCateMain1 {

    public static void main(String[] args){
        Predicate<String> predicate = s -> s.length()>5;
        System.out.println(predicate.test("abcdef"));
        System.out.println(predicate.negate().test("abc"));
    }
}
