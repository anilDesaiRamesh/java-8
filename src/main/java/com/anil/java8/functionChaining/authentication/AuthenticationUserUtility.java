package com.anil.java8.functionChaining.authentication;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class AuthenticationUserUtility {


    public static User getUserCreds() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name ");
        String stUserName = scanner.next();

        if(stUserName.trim().length()<=5)
            throw new Exception("User Name should be more than 5 chars");

        System.out.println("Please enter password ");
        String stPwd = scanner.next();
        return new User(stUserName,stPwd);

    }


    public static boolean authenticateUser(User user) {

        Function<String,String> function = s -> s.substring(0,5).toLowerCase();
        Predicate<String> userNameVal = s -> s.trim().equalsIgnoreCase("durga");
        Predicate<String> passwordVal = s -> s.trim().equalsIgnoreCase("java");
        return userNameVal.test(function.apply(user.getStUserName())) && passwordVal.test(user.getStPwd());

    }
}
