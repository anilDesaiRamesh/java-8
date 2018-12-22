package com.anil.java8.lambdaexpression.examp3;

public class StringLengthMain {
    public static void main(String[] args){
        IStringLength stringLength = (s) -> s.length();
        stringLength.getLength("Testing");
        stringLength.getLength("Lambda expression");
    }
}
