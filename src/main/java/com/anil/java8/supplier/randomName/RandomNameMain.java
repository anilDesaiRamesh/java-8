package com.anil.java8.supplier.randomName;

import java.util.function.Supplier;

public class RandomNameMain {

    public static void main(String[] args){
        Supplier<String> supplier = () -> {
            String[] s1 = {"Sunny","Bunny","Chinny","Vinny"};
            int iRandomNo = (int) (Math.random() * 4);
            return s1[iRandomNo];
        };
        System.out.println(supplier.get());
    }
}
