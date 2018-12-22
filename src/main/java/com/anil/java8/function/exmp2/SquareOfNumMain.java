package com.anil.java8.function.exmp2;

import java.util.function.Function;

public class SquareOfNumMain {

    public static void main(String[] args){

        Function<Integer,Integer> function = i -> i*i;
        System.out.println("Square of num is " + function.apply(5));
        System.out.println("Square of num is " + function.apply(10));
    }
}
