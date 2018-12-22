package com.anil.java8.predicate.authenticate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationUtility {

    public static User getUserDetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user id");
        String stUserName = scanner.next();
        System.out.println("Please enter password");
        String stPassword = scanner.next();
        return new User(stUserName,stPassword);
    }

    public static boolean authenticateUser(User userDetails) {

        Predicate<User> predicate = user -> user.getStUserName().trim().equalsIgnoreCase("durga")
                && user.getStPassword().trim().equalsIgnoreCase("java");
        return predicate.test(userDetails);
    }
}
