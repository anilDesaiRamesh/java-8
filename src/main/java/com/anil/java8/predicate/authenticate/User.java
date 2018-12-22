package com.anil.java8.predicate.authenticate;

public class User {

    private String stUserName;

    public String getStUserName() {
        return stUserName;
    }

    public void setStUserName(String stUserName) {
        this.stUserName = stUserName;
    }

    public String getStPassword() {
        return stPassword;
    }

    public void setStPassword(String stPassword) {
        this.stPassword = stPassword;
    }

    private String stPassword;

    public User(String stUserName, String stPassword) {
        this.stUserName = stUserName;
        this.stPassword = stPassword;
    }




}
