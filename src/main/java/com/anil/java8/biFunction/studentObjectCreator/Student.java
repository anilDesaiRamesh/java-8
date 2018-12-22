package com.anil.java8.biFunction.studentObjectCreator;

public class Student {

    private String stName;
    private int iRollNo;

    public Student(String stName, int iRollNo) {
        this.stName = stName;
        this.iRollNo = iRollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", iRollNo=" + iRollNo +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getiRollNo() {
        return iRollNo;
    }

    public void setiRollNo(int iRollNo) {
        this.iRollNo = iRollNo;
    }
}
