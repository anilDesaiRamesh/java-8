package com.anil.java8.predicate.joining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrediCateJoiningMain {

    public static void main(String[] args){

        int[] x = {0,5,10,15,20,25,30};
        Predicate<Integer> predicateG10 = i -> i>10;
        Predicate<Integer> predicateEven = i -> i%2==0;
        System.out.println("Numbers greater than 10");
        m1(predicateG10,x);
        System.out.println("Even Numbers");
        m1(predicateEven,x);
        System.out.println("Numbers not greater than 10");
        m1(predicateG10.negate(),x);
        System.out.println("Not Even Numbers");
        m1(predicateEven.negate(),x);
        System.out.println("Numbers greater than 10 and even");
        m1(predicateG10.and(predicateEven),x);
        System.out.println("Numbers greater than 10 or even");
        m1(predicateG10.or(predicateEven),x);
        System.out.println("Predicate 'default And' method implemented");
        m2(predicateG10,predicateEven,x);
    }

    public static void m1(Predicate<Integer> predicate, int[] x){

        List<Integer> list = new ArrayList<>();
        for(int x1 : x){
            if(predicate.test(x1))
                list.add(x1);
        }
        System.out.println(list);

    }

    public static void m2(Predicate<Integer> predicate1, Predicate<Integer> predicate2 , int[] x){

        List<Integer> list = new ArrayList<>();

        for(int x1 : x){
            if(predicate1.test(x1) && predicate2.test(x1))
                    list.add(x1);
        }
        System.out.println(list);
    }
}
