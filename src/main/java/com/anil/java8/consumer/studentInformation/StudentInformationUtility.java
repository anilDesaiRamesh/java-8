package com.anil.java8.consumer.studentInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInformationUtility {
    public static List<Student> popualteData() {

        List<Student> students = new ArrayList<>();
        students.add(getStudentInfo("Sunny",100));
        students.add(getStudentInfo("Bunny",65));
        students.add(getStudentInfo("Chinny",55));
        students.add(getStudentInfo("Vinny",45));
        students.add(getStudentInfo("Pinny",25));
        return students;
    }

    private static Student getStudentInfo(String stName, int iGrade) {
        return new Student(stName,iGrade);
    }


    public static void populateGradeInfo(List<Student> students) {

        Function<Student,Grade> function = student -> {
            int iMarks = student.getiMarks();
            if(iMarks>=80)
                return Grade.A_DISTINCTION;
            else if(iMarks>=60 && iMarks < 80)
                return Grade.B_FIRST_CLASS;
            else if(iMarks>=50 && iMarks < 60)
                return Grade.C_SECOND_CLASS;
            else if(iMarks>=35 && iMarks < 50)
                return Grade.D_THIRD_CLASS;
            else
                return Grade.E_FAIL;
        };

        for(Student student : students){
            student.seteGrade(function.apply(student));
        }
    }

    public static void displayStudentInfo(List<Student> students) {

        Predicate<Student> predicate = student -> student.getiMarks()>60;

        Consumer<Student> consumer = student -> {
            System.out.println("**************************");
            System.out.println("Student Name " + student.getStName());
            System.out.println("Student Marks " + student.getiMarks());
            System.out.println("Student Grade " + student.geteGrade());
            System.out.println();
        };

        for(Student student : students){
            if(predicate.test(student))
                consumer.accept(student);
        }
    }
}
