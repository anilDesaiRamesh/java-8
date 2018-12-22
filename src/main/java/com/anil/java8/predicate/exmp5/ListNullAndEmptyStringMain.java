package com.anil.java8.predicate.exmp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListNullAndEmptyStringMain {

    public static void main(String[] args){

    String[] stNames = {"Durga"," ",null,"Ravi"," ","Shiva",null};
    List<String> lInputList = Arrays.asList(stNames);
    List<String> strings = checkNullAndEmptyString(lInputList);
    System.out.println("List after removing null and blank values");
    System.out.println(strings);
    }

    public static List<String> checkNullAndEmptyString(List<String> list){

        List<String> finalList = new ArrayList<>();
        int size = list.size();
        int iCounter =0;
        while(iCounter!=size){
            String stListMember = list.get(iCounter);;
            if(predicateCheck(stListMember))
                finalList.add(stListMember);
            iCounter++;
        }
        return finalList;
    }

    public static boolean predicateCheck(String stName){

        Predicate<String> predicate = s -> s != null && s.trim().length()!=0;
        return predicate.test(stName);

    }
}
