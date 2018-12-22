package com.anil.java8.predicate.authenticate;

public class AutenticateMain {

    public static void main(String[] args){

        User userDetails = AuthenticationUtility.getUserDetails();
        if(AuthenticationUtility.authenticateUser(userDetails))
            System.out.println("Valid user, you can get all services");
        else
            System.out.println("Invalid user");

    }
}
