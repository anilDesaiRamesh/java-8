package com.anil.java8.intFunction.exmp2;

import java.util.function.ToIntFunction;

public class Examp2 {

    public static void main(String[] args){

        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("AnilDesai"));

    }
}
