package com.anil.java8.predicate.isEqualM;

import java.util.function.Predicate;

public class PredicateIsEqualMethodMain {

    public static void main(String[] args){
        Predicate<Object> predicate = Predicate.isEqual("DURGASOFT");
        System.out.println(predicate.test("DURGASOFT"));
        System.out.println(predicate.test("DURGA"));
    }
}
