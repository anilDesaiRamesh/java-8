package com.anil.java8.function.salaryIncrement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncementUtility {
    public static List<Employee> populateEmployee() {


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

    public static List<Employee> checkEmployeeWithSalaryIncrement(List<Employee> employees) {

        List<Employee> finalIncrementList = new ArrayList<>();
        for(Employee emp : employees){
            if(checkEmployeeEligibleForIncrement(emp))
                finalIncrementList.add(incrementSalaryOfEmployee(emp));

        }
        return finalIncrementList;

    }

    private static Employee incrementSalaryOfEmployee(Employee emp) {

        Function<Employee,Employee> function = employee -> {
            employee.setdSalary(employee.getdSalary()+477);
            return employee;};
        return function.apply(emp);
    }

    private static boolean checkEmployeeEligibleForIncrement(Employee emp) {
        Predicate<Employee> predicate = employee -> employee.getdSalary()<3500;
        return predicate.test(emp);
    }
}
