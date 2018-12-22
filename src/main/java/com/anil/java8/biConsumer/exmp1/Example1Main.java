package com.anil.java8.biConsumer.exmp1;

import java.util.function.BiConsumer;

public class Example1Main {

    public static void main(String[] args){

        BiConsumer<String,String> biConsumer = (s, s2) -> System.out.println(s+" "+s2);

       biConsumer.accept("Anil","Desai");

    }
}
