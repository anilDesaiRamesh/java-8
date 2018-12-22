package com.anil.java8.function.salaryIncrement;

import java.util.List;

public class SalaryIncrementMain {

    public static void main(String[] args){

        List<Employee> employees = SalaryIncementUtility.populateEmployee();
        System.out.println("Pre Salary Increment");
        System.out.println(employees);

        List<Employee> incrementedEmployeeList = SalaryIncementUtility.checkEmployeeWithSalaryIncrement(employees);

        System.out.println("Post Salary Increment");
        System.out.println(incrementedEmployeeList);
        System.out.println(employees);


    }
}
