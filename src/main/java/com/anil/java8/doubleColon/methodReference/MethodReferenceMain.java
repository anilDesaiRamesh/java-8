package com.anil.java8.doubleColon.methodReference;

public class MethodReferenceMain {

    public void m1(){
        for(int i=0;i<10;i++)
        System.out.println("Child Thread - using method reference");
    }

    public static void main(String[] args){

        MethodReferenceMain methodReferenceMain = new MethodReferenceMain();
        Runnable runnable = methodReferenceMain :: m1;
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
