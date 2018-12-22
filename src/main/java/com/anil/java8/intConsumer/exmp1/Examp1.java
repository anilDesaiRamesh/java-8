package com.anil.java8.intConsumer.exmp1;

import java.util.function.IntConsumer;

public class Examp1 {

    public static void main(String[] args){
        IntConsumer intConsumer = i -> System.out.println(i*i);
        intConsumer.accept(2);
    }
}
