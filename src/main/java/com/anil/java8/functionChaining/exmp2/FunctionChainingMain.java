package com.anil.java8.functionChaining.exmp2;

import java.util.function.Function;

public class FunctionChainingMain {

    public static void main(String[] args){

        Function<Integer,Integer> f1 = i -> i+i;
        Function<Integer,Integer> f2 = i -> i*i*i;

        System.out.println("Function chaining with andThen " + f1.andThen(f2).apply(2));
        System.out.println("Function chaining with compose " + f1.compose(f2).apply(2));

    }
}
