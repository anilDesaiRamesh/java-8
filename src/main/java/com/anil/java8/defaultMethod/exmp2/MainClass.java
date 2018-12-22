package com.anil.java8.defaultMethod.exmp2;

public class MainClass implements Ileft,IRight {

    @Override
    public void m1() {
        System.out.println("My Own Implementation!!!");
        //or
        Ileft.super.m1();
        //or
        IRight.super.m1();
    }

    public static void main(String[] args){
        MainClass mainClass = new MainClass();
        mainClass.m1();
    }
}
