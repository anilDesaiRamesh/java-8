package com.anil.java8.function.studentGrade;

public class Student {

    private String stName;
    private int iMarks;
    private StudentGradeEnum cGrade;

    public Student(String stName, int iMarks) {
        this.stName = stName;
        this.iMarks = iMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", cGrade=" + cGrade +
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

    public StudentGradeEnum getcGrade() {
        return cGrade;
    }

    public void setcGrade(StudentGradeEnum cGrade) {
        this.cGrade = cGrade;
    }
}
