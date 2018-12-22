package com.anil.java8.function.salaryIncrement;

public class Employee {

    private String stName;
    private double dSalary;

    public Employee(String stName, double dSalary) {
        this.stName = stName;
        this.dSalary = dSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "stName='" + stName + '\'' +
                ", dSalary=" + dSalary +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public double getdSalary() {
        return dSalary;
    }

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }
}
