package com.anil.java8.intFunction.exmp1;

import java.util.function.IntFunction;

public class Examp1 {

    public static void main(String[] args){


        IntFunction<Integer> intFunction = i -> i*i;
        System.out.println(intFunction.apply(5));
    }
}
