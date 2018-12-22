package com.anil.java8.unaryOperator.exmp1;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Examp1 {

    public static void main(String[] args){

        UnaryOperator<Integer> unaryOperator = integer -> integer * integer;

        System.out.println(unaryOperator.apply(6));

        IntUnaryOperator intUnaryOperator = i -> i*i;

        System.out.println(intUnaryOperator.applyAsInt(6));
    }
}
