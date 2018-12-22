package com.anil.java8.supplier;

import java.util.Arrays;
import java.util.function.Supplier;

public class randomPassword {

    public static void main(String[] args){

        //Rules
        /*Length should be 8 chars
        2,4,6,8 places only digits
        1,3,5,7 places only upper case alphabets and special chars @ # $*/

        Supplier<String> supplier=() -> {

            String stRandomPassword ="";
            for(int i=0;i<=8;i++){
                if(i%2==0){
                    int iRandomNum = (int)(Math.random()*10);
                    stRandomPassword = stRandomPassword+iRandomNum;
                }
                else{
                    int rnd = (int) (Math.random() * 52); // or use Random or whatever
                    char base = (rnd < 26) ? 'A' : 'a';
                    String stAlpha = String.valueOf(base).toUpperCase();
                    String[] stAlphaSpecial = {stAlpha,"@","#","$"};
                    stRandomPassword = stRandomPassword + stAlphaSpecial[(int)(Math.random()*4)];
                }
            }
            return stRandomPassword;
        };

        System.out.println("Random Password : "  + supplier.get());


    }
}
