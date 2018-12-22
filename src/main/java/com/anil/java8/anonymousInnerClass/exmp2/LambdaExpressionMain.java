package com.anil.java8.anonymousInnerClass.exmp2;

public class LambdaExpressionMain {

    public static void main(String[] args){

        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread with Lambda");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread with Lambda");
        }
    }
}
