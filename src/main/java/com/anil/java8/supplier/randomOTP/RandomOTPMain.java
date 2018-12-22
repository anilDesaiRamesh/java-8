package com.anil.java8.supplier.randomOTP;

import java.util.function.Supplier;

public class RandomOTPMain {

    public static void main(String[] args){
        Supplier<String> supplier = () -> {
            String stOtp="";

            for(int i=0;i<6;i++){
                int iRandom=0;
                iRandom = (int)(Math.random()*10);
                stOtp = stOtp+iRandom;
            }
            return stOtp;
        };
        System.out.println(supplier.get());
    }
}
