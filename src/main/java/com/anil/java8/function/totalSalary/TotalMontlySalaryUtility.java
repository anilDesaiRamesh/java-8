package com.anil.java8.function.totalSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TotalMontlySalaryUtility {
    public static List<Employee> getEmployees() {

        List<Employee> list = new ArrayList<>();
        list.add(getEmployee("Sunny",1000));
        list.add(getEmployee("Bunny",2000));
        list.add(getEmployee("Chinny",3000));
        list.add(getEmployee("Piunny",4000));
        list.add(getEmployee("Viunny",5000));
        list.add(getEmployee("Durga",10000));
        return list;
    }

    private static Employee getEmployee(String stName, double dSalary) {
        return new Employee(stName,dSalary);
    }

    public static double getTotalMontlySalary(List<Employee> employeeList) {

        Function<List<Employee>,Double> function = employees -> {
            Double dSalary =0d;
            for(Employee emp : employees){
                dSalary = dSalary+emp.getdSalary();
            }
            return dSalary;
        };

        return function.apply(employeeList);

    }
}
