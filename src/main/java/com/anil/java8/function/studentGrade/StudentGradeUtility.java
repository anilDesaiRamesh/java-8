package com.anil.java8.function.studentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeUtility {
    public static List<Student> populateData() {

        List<Student> list = new ArrayList<>();
        list.add(getStudentData("Sunny",100));
        list.add(getStudentData("Bunny",65));
        list.add(getStudentData("Chinny",55));
        list.add(getStudentData("Vinny",45));
        list.add(getStudentData("Pinny",25));
        return list;
    }

    private static Student getStudentData(String stName, int iMarks) {
        return new Student(stName,iMarks);
    }

    public static List<Student> populateGradeForStudents(List<Student> listOfStudents) {

        List<Student> finalList = new ArrayList<>();

        for(Student student : listOfStudents){
            finalList.add(getGradeBasedOnMarks(student));
        }
        return finalList;

    }

    private static Student getGradeBasedOnMarks(Student student) {

        Function<Student,StudentGradeEnum> function = student1 -> getGrade(student1.getiMarks());
        StudentGradeEnum cGrade = function.apply(student);
        student.setcGrade(cGrade);
        return student;
    }

    private static StudentGradeEnum getGrade(int iMarks) {

        if(iMarks >= 80)
            return StudentGradeEnum.DISTINCTION;
        else if(iMarks >= 65 && iMarks<80)
            return StudentGradeEnum.FIRSTCLASS;
        else if(iMarks >= 50 && iMarks<65)
            return StudentGradeEnum.SECONDCLASS;
        else if(iMarks>=35 && iMarks<50)
            return StudentGradeEnum.THIRDCLASS;
        else
            return StudentGradeEnum.FAIL;
    }

    public static List<Student> getStudentsWithMarksGrt60(List<Student> listOfStudents) {

        List<Student> list = new ArrayList<>();
        for(Student student : listOfStudents){
            if(checkMarks(student))
                list.add(student);
        }
        return list;
    }

    private static boolean checkMarks(Student student) {
        Predicate<Student> predicate = student1 -> student1.getiMarks()>=60;
        return predicate.test(student);
    }
}
