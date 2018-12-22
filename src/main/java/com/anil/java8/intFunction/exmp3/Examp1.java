package com.anil.java8.intFunction.exmp3;

import java.util.function.IntToDoubleFunction;

public class Examp1 {

    public static void main(String[] args){

        IntToDoubleFunction intToDoubleFunction = i -> Math.sqrt(i);

        System.out.println(intToDoubleFunction.applyAsDouble(2));

    }
}
