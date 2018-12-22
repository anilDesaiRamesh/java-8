package com.anil.java8.functionChaining.exmp1;

import java.util.function.Function;

public class FunctionChainingMain {

    public static final String stName="anilrameshdesai";
    public static void main(String[] args){

        Function<String,String> f1 = s -> s.toUpperCase();
        Function<String,String> f2 = s -> s.trim().substring(0,10);

        System.out.println("Function 1 " +f1.apply(stName));
        System.out.println("Function 2 " +f2.apply(stName));
        System.out.println("Function Chaining using andThen  " + f1.andThen(f2).apply(stName));
        System.out.println("Function Chaining using compose  " + f1.compose(f2).apply(stName));

    }
}
