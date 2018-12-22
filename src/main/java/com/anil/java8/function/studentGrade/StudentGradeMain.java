package com.anil.java8.function.studentGrade;

import java.util.List;

public class StudentGradeMain {

    public static void main(String[] args){

        List<Student> listOfStudents = StudentGradeUtility.populateData();

        listOfStudents = StudentGradeUtility.populateGradeForStudents(listOfStudents);

        System.out.println("Students with Grades");
        System.out.println(listOfStudents);
        System.out.println("*********************");
        System.out.println();

        List<Student> grtThan60 = StudentGradeUtility.getStudentsWithMarksGrt60(listOfStudents);
        System.out.println("List if students with marks greater than or equal to 60");
        System.out.println(grtThan60);
        System.out.println("*********************");
        System.out.println();




    }
}
