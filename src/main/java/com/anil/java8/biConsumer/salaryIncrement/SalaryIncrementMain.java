package com.anil.java8.biConsumer.salaryIncrement;

import java.util.List;

public class SalaryIncrementMain {

    public static void main(String[] args){


        List<Employee> employees = SalaryIncrementUtility.populateData();
        SalaryIncrementUtility.incrementSalary(employees);

    }
}
