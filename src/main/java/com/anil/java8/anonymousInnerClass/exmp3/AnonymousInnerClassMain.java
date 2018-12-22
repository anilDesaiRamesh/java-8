package com.anil.java8.anonymousInnerClass.exmp3;



public class AnonymousInnerClassMain {

    int x = 888;

    public void m2(){
        IAnonymousInnerClass anonymousInnerClass = new IAnonymousInnerClass(){
            int x = 999;

            @Override
            public void m1() {
                System.out.println(this.x);
            }
        };
        anonymousInnerClass.m1();
    }

    public static void main(String[] args){

        AnonymousInnerClassMain anonymousInnerClassMain = new AnonymousInnerClassMain();
        anonymousInnerClassMain.m2();

    }
}
