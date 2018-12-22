package com.anil.java8.staticMethod.exmp1;

public class StaticMethodImpl {

    public static void main(String[] args){

        /*Interface static method
        *can be called using Interface name only
        m1();
        StaticMethodImpl staticMethod = new StaticMethodImpl();
        staticMethod.m1();
        StaticMethodImpl.m1();*/
        IStaticMethod.m1();
    }
}
