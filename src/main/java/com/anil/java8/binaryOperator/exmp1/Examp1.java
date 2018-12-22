package com.anil.java8.binaryOperator.exmp1;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Examp1 {

    public static void main(String[] args){

        BiFunction<String,String,String> biFunction = (s, s2) -> s+"  "+s2;
        System.out.println(biFunction.apply("Anil","Desai"));

        BinaryOperator<String> binaryOperator = (s, s2) -> s+" "+s2;
        System.out.println(binaryOperator.apply("Anil","Desai"));

        IntBinaryOperator intBinaryOperator  = (i, i1) -> i+i1;
        System.out.println(intBinaryOperator.applyAsInt(10,20));
    }
}
