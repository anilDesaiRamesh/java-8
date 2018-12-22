package com.anil.java8.predicate.emplyeeManagement;

public class Employee {

    private String stName;
    private String stDesignation;
    private double dSalary;
    private String stCity;

    public Employee(String stName, String stDesignation, double dSalary, String stCity) {
        this.stName = stName;
        this.stDesignation = stDesignation;
        this.dSalary = dSalary;
        this.stCity = stCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "stName='" + stName + '\'' +
                ", stDesignation='" + stDesignation + '\'' +
                ", dSalary=" + dSalary +
                ", stCity='" + stCity + '\'' +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStDesignation() {
        return stDesignation;
    }

    public void setStDesignation(String stDesignation) {
        this.stDesignation = stDesignation;
    }

    public double getdSalary() {
        return dSalary;
    }

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }

    public String getStCity() {
        return stCity;
    }

    public void setStCity(String stCity) {
        this.stCity = stCity;
    }
}
