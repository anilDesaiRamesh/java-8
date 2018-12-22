package com.anil.java8.function.exmp4;

import java.util.function.Function;

public class FindNoOfSpacesInStringMain {

    public static void main(String[] args){

        String stName = "Durga Software Solutions Hyderabad";

        Function<String,Integer> function = s -> s.length()-s.replaceAll(" ","").length();
        System.out.println(function.apply(stName));

    }
}
