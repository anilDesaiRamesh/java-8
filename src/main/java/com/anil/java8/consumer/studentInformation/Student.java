package com.anil.java8.consumer.studentInformation;

public class Student {

    String stName;
    int iMarks;
    Grade eGrade;

    public Student(String stName, int iMarks) {
        this.stName = stName;
        this.iMarks = iMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", iMarks=" + iMarks +
                ", eGrade=" + eGrade +
                '}';
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getiMarks() {
        return iMarks;
    }

    public void setiMarks(int iMarks) {
        this.iMarks = iMarks;
    }

    public Grade geteGrade() {
        return eGrade;
    }

    public void seteGrade(Grade eGrade) {
        this.eGrade = eGrade;
    }
}
