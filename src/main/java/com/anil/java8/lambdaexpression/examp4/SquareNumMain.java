package com.anil.java8.lambdaexpression.examp4;

public class SquareNumMain {

    public static void main(String[] args){

        ISquareNum squareNum = i-> i * i;
        System.out.println("Square of num 10 "+squareNum.squareNum(10));
        System.out.println("Square of num 20 "+squareNum.squareNum(20));
    }
}
