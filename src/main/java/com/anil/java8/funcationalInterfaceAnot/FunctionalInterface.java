package com.anil.java8.funcationalInterfaceAnot;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    public void m1();

    default void m2() {
    }

    public static void m3() {
    }
}
