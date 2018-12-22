package com.anil.java8.biFunction.monthlySalary;

public class Employee {

    private String stEmpName;
    private int iEmpNo;
    private double dDailyWage;

    public Employee(String stEmpName, int iEmpNo, double dDailyWage) {
        this.stEmpName = stEmpName;
        this.iEmpNo = iEmpNo;
        this.dDailyWage = dDailyWage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "stEmpName='" + stEmpName + '\'' +
                ", iEmpNo=" + iEmpNo +
                ", dDailyWage=" + dDailyWage +
                '}';
    }

    public String getStEmpName() {
        return stEmpName;
    }

    public void setStEmpName(String stEmpName) {
        this.stEmpName = stEmpName;
    }

    public int getiEmpNo() {
        return iEmpNo;
    }

    public void setiEmpNo(int iEmpNo) {
        this.iEmpNo = iEmpNo;
    }

    public double getdDailyWage() {
        return dDailyWage;
    }

    public void setdDailyWage(double dDailyWage) {
        this.dDailyWage = dDailyWage;
    }
}
