package com.anil.java8.collections.set;

import java.util.Comparator;
import java.util.TreeSet;

public class SetLambdaMain {

    public static void main(String[] args){

        Comparator<Integer> customComp = (i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? 1 : 0;

        TreeSet<Integer> tSet = new TreeSet<>(customComp);
        tSet.add(10);
        tSet.add(0);
        tSet.add(15);
        tSet.add(25);
        tSet.add(25);
        tSet.add(20);
        System.out.println("Tree set sorting using lambda " + tSet);

    }
}
