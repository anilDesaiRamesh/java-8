package com.anil.java8.biFunction.monthlySalary;

public class TimeSheet {

    private int iEmpNo;
    private int iNoOfDays;

    public TimeSheet(int iEmpNo, int iNoOfDays) {
        this.iEmpNo = iEmpNo;
        this.iNoOfDays = iNoOfDays;
    }

    @Override
    public String toString() {
        return "TimeSheet{" +
                "iEmpNo=" + iEmpNo +
                ", iNoOfDays=" + iNoOfDays +
                '}';
    }

    public int getiEmpNo() {
        return iEmpNo;
    }

    public void setiEmpNo(int iEmpNo) {
        this.iEmpNo = iEmpNo;
    }

    public int getiNoOfDays() {
        return iNoOfDays;
    }

    public void setiNoOfDays(int iNoOfDays) {
        this.iNoOfDays = iNoOfDays;
    }
}
