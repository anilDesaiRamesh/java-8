package com.anil.java8.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSortingLambda {

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        l.add(20);
        Comparator<Integer> customComparator = (i1,i2) -> (i1>i2) ? -1 : (i1 < i2) ? 1 : 0;
        Collections.sort(l,customComparator);
        System.out.println("Sorted Array list using Lambda expressions " + l);
    }
}
