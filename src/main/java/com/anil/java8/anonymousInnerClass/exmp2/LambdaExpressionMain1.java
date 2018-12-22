package com.anil.java8.anonymousInnerClass.exmp2;

public class LambdaExpressionMain1 {

    public static void main(String[] args){

        Thread t = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Child Thread - Lambda expression");
            }
        });
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread - Lambda Expression");
        }

    }
}
