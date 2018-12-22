package com.anil.java8.biFunction.productOfNumbers;

import java.util.function.BiFunction;

public class ProductOfNums {

    public static void main(String[] args){

        BiFunction<Integer,Integer,Integer> biFunction = (i1, i2) -> i1*i2;

        System.out.println(biFunction.apply(10,20));
        System.out.println(biFunction.apply(100,200));
    }
}
