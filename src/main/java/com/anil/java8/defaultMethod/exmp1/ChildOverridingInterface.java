package com.anil.java8.defaultMethod.exmp1;

public class ChildOverridingInterface implements IParentInterface {
    @Override
    public void m1() {
        System.out.println("My Own implemented method !!!!");
    }

    public static void main(String[] args){
        ChildOverridingInterface childOverridingInterface = new ChildOverridingInterface();
        childOverridingInterface.m1();
    }
}
