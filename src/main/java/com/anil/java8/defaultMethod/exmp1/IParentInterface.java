package com.anil.java8.defaultMethod.exmp1;

public interface IParentInterface {

    default void m1(){
        System.out.println("Default implementation inside interface");
    }
}
