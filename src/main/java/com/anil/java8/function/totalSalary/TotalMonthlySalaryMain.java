package com.anil.java8.function.totalSalary;

import java.util.List;

public class TotalMonthlySalaryMain {

    public static void main(String[] args){

        List<Employee> employeeList = TotalMontlySalaryUtility.getEmployees();
        double dTotal = TotalMontlySalaryUtility.getTotalMontlySalary(employeeList);
        System.out.println("Total Monthly Salary of the employees " + dTotal);


    }
}
