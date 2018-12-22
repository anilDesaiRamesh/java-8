package com.anil.java8.consumer.studentInformation;

import java.util.List;

public class StudentInformationMain {

    public static void main(String[] args){


        List<Student> students = StudentInformationUtility.popualteData();
        StudentInformationUtility.populateGradeInfo(students);
        StudentInformationUtility.displayStudentInfo(students);

    }
}
