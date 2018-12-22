package com.anil.java8.intPredicate.exmp1;

import java.util.function.IntPredicate;

public class Exmp1 {

    public static void main(String[] args){

        IntPredicate intPredicate = i -> i%2==0;
        int[] x = {0,5,10,15,20,25,30};
        for(int x1:x){
            if(intPredicate.test(x1))
            System.out.println(x1);
        }

    }
}
