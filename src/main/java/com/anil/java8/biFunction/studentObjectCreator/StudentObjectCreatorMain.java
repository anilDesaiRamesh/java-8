package com.anil.java8.biFunction.studentObjectCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class StudentObjectCreatorMain {

    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        BiFunction<String,Integer,Student> biFunction = (s, i) -> new Student(s,i);
        students.add(biFunction.apply("Durga",100));
        students.add(biFunction.apply("Java",200));
        students.add(biFunction.apply("Anil",300));

        Consumer<Student> consumer = student -> {
            System.out.println("Student Name " + student.getStName());
            System.out.println("Student Roll No " + student.getiRollNo());
            System.out.println();
        };
        for(Student student : students){
            consumer.accept(student);
        }
    }
}
