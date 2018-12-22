package com.anil.java8.functionChaining.authentication;

public class AuthenticationMain {

    public static void main(String[] args) throws Exception {

        User user = AuthenticationUserUtility.getUserCreds();

        boolean status = AuthenticationUserUtility.authenticateUser(user);

        if(status)
            System.out.println("Valid User");
        else
            System.out.println("Invalid User");


    }
}
