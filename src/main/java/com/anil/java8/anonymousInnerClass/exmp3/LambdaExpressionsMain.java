package com.anil.java8.anonymousInnerClass.exmp3;



public class LambdaExpressionsMain {
    int x =888;
    public void m2() {
        IAnonymousInnerClass iAnonymousInnerClass = () -> {
            int x=999;
            System.out.println(this.x);
        };
        iAnonymousInnerClass.m1();
    }

    public static void main(String[] args){
        LambdaExpressionsMain lambdaExpressionsMain = new LambdaExpressionsMain();
        lambdaExpressionsMain.m2();
    }
}
