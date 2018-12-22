package com.anil.java8.function.identityMethod;

import java.util.function.Function;

public class identityMethodMain {

    public static void main(String[] args){

        Function<String,String> function = Function.identity();
        System.out.println("Identifity Method " + function.apply("anil"));

    }
}
