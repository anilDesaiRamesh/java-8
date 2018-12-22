package com.anil.java8.anonymousInnerClass.exmp4;

public class LocalVariablesAccessMain {

    int x =10;

    public void m2(){
        int y=20;
        ILocalVariableAccess iLocalVariableAccess = () -> {
            x=100;
            /*Local variables
            *cannot be accessed inside lambda expression
            y=100;*/
            System.out.println("the value of instance variable " + x);
            System.out.println("the value of local variable " + y);
        };
        iLocalVariableAccess.m1();
    }

    public static void main(String[] args){
        LocalVariablesAccessMain localVariablesAccessMain = new LocalVariablesAccessMain();
        localVariablesAccessMain.m2();
    }

}
