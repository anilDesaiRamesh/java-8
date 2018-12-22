package com.anil.java8.predicate.exmp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PrediCateCollections {

    public static void main(String[] args){
        Predicate<Collection> predicate = c -> c.isEmpty();
        System.out.println("Array List is empty " + predicate.test(new ArrayList()));
        List<String> list = new ArrayList<>();
        list.add("A");
        System.out.println("Array List is empty " + predicate.test(list));

    }
}
