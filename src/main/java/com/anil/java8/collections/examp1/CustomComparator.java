package com.anil.java8.collections.examp1;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer t1, Integer t2) {

       return (t1 > t2) ? -1 : (t1 < t2) ? 1 : 0;

    }
}
