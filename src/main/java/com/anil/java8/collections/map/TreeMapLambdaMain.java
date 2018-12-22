package com.anil.java8.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapLambdaMain {

    public static void main(String[] args){
        Comparator<Integer> comparator = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
        TreeMap<Integer,String> treeMap = new TreeMap<>(comparator);
        treeMap.put(100,"Durga");
        treeMap.put(600,"Sunny");
        treeMap.put(300,"Bunny");
        treeMap.put(200,"Chinny");
        treeMap.put(700,"Vinny");
        treeMap.put(400,"Pinny");
        treeMap.put(400,"Rock");
        System.out.println("Tree map with lambda " + treeMap);
    }
}
