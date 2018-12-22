package com.anil.java8.functionChaining.authentication;

public class User {

    private String stUserName;
    private String stPwd;

    public User(String stUserName, String stPwd) {
        this.stUserName = stUserName;
        this.stPwd = stPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "stUserName='" + stUserName + '\'' +
                ", stPwd='" + stPwd + '\'' +
                '}';
    }

    public String getStUserName() {
        return stUserName;
    }

    public void setStUserName(String stUserName) {
        this.stUserName = stUserName;
    }

    public String getStPwd() {
        return stPwd;
    }

    public void setStPwd(String stPwd) {
        this.stPwd = stPwd;
    }
}
