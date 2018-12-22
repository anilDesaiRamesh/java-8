package com.anil.java8.lambdaexpression.examp1;

public class FunctionalInterfaceImpl{

    public static void main(String[] args ){
        FunctionalInterface functionalInterface = () -> System.out.println("Lambda expression implementation");
        functionalInterface.m1();
    }
}
