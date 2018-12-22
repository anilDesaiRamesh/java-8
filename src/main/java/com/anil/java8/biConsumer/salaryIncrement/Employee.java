package com.anil.java8.biConsumer.salaryIncrement;

public class Employee {

    private String stEmpName;
    private double dSalary;

    public Employee(String stEmpName, double dSalary) {
        this.stEmpName = stEmpName;
        this.dSalary = dSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "stEmpName='" + stEmpName + '\'' +
                ", dSalary=" + dSalary +
                '}';
    }

    public String getStEmpName() {
        return stEmpName;
    }

    public void setStEmpName(String stEmpName) {
        this.stEmpName = stEmpName;
    }

    public double getdSalary() {
        return dSalary;
    }

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }
}
