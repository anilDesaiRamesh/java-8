package com.anil.java8.lambdaexpression.examp2;

public class AddTwoNumbersImpl {

    public static void main(String[] args){

        AddTwoNumbersInterface inter = (i,j)-> System.out.println("The Sum is : " + (i+j));
        inter.add(10,20);
        inter.add(30,40);
    }

}
