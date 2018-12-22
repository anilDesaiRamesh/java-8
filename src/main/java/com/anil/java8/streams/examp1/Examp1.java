package com.anil.java8.streams.examp1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Examp1 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Pavan");
        list.add("RaviTeja");
        list.add("Cheranjeevi");
        list.add("Venkatesh");
        list.add("Nagarjuna");

        Predicate<String> predicate = s -> s.length() >= 9;
        List<String> finalList = list.stream().filter(predicate).collect(Collectors.toList());
        long iCountOfElements = list.stream().filter(predicate).count();
        System.out.println("List using filter " + finalList);
        System.out.println("List using filter count " + iCountOfElements );

        Function<String,String> function = s -> s.toUpperCase();
        List<String> finalList1 = list.stream().map(function).collect(Collectors.toList());
        System.out.println("List using Map " + finalList1);

        List<String> defaultNaturalSorting = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorting based on default natural sorting order " + defaultNaturalSorting);


        Comparator<String> comparator = (s, t1) -> -s.compareTo(t1);
        /*or
        Comparator<String> comparator = (s, t1) -> t1.compareTo(s);*/
        List<String> customizedSortingOrder = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println("Customized sorted " + customizedSortingOrder);

        String stMin = list.stream().min(comparator).orElse(null);
        System.out.println("Minimum Val : " + stMin);


        String stMax = list.stream().max(comparator).orElse(null);
        System.out.println("Maximum Val : " + stMax);

        //using lambda expression
        System.out.println("Using method reference");
        list.stream().forEach(s -> System.out.println(s));

        //using method reference
        System.out.println("Using method reference");
        list.stream().forEach(System.out::println);

        String[] stNames = list.stream().toArray(String[]::new);
        System.out.println("List to Array");
        for (String stName: stNames) {
            System.out.println(stName);
        }

    }
}
