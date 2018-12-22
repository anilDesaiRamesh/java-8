package com.anil.java8.function.exmp3;

import java.util.function.Function;

public class RemoveSpaceInStringMain {

    public static void main(String[] args){

        String stName = "Durga Software Solutions Hyderabad";

        Function<String,String> funciton= s-> s.replaceAll(" ","");
        System.out.println(funciton.apply(stName));
    }
}
