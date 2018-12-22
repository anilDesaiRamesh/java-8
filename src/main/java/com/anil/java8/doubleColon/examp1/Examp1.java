package com.anil.java8.doubleColon.examp1;

public class Examp1 {

    public static void m2(){
        System.out.println("Implementation by method reference");
    }

    public static void main(String[] args){

        Intref intref = Examp1::m2;
        intref.m1();

    }

}
