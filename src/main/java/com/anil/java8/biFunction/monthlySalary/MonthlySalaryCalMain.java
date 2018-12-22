package com.anil.java8.biFunction.monthlySalary;

import java.util.function.BiFunction;

public class MonthlySalaryCalMain {

    public static void main(String[] args){

        BiFunction<Employee,TimeSheet,Double> biFunction = (employee, timeSheet) ->
                employee.getdDailyWage()*timeSheet.getiNoOfDays();

        Employee employee = new Employee("Durga",100,1500);
        TimeSheet timeSheet = new TimeSheet(100,25);

        if(employee.getiEmpNo()==timeSheet.getiEmpNo())
            System.out.println("Employee Monthly Salary " + biFunction.apply(employee,timeSheet));

    }
}
