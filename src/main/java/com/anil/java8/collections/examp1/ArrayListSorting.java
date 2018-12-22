package com.anil.java8.collections.examp1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        System.out.println("Array List before sorting " + l);
        Collections.sort(l);
        System.out.println("Array List after natural sorting " + l);
        Collections.sort(l,new CustomComparator());
        System.out.println("Array List after custom sorting " + l);

    }
}
