package com.anil.java8.function.stringLength;

import java.util.function.Function;

public class StringLengthMain {

    public static void main(String[] args){

        Function<String,Integer> function = s -> s.length();
        System.out.println(function.apply("Durga"));
        System.out.println(function.apply("Anil"));

    }

}
