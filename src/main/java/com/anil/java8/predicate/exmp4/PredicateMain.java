package com.anil.java8.predicate.exmp4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args){

        String[] stNames = {"Sunny","Kajal","mallika","katrina","kareena"};
        Predicate<String> predicate = s -> s.trim().startsWith("K");
        System.out.println("Names starting with 'K'");
        findNamesStartgingWithK(predicate,stNames);
    }

    private static void findNamesStartgingWithK(Predicate<String> predicate, String[] stNames) {
        List<String> list = new ArrayList<>();
        for(String stName : stNames){
            if(predicate.test(stName.toUpperCase()))
                list.add(stName);
        }
        System.out.println(list);
    }
}
