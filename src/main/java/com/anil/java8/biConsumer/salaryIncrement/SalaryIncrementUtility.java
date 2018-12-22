package com.anil.java8.biConsumer.salaryIncrement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class SalaryIncrementUtility {
    private static final Double INCREMENT_VALUE = 500.00 ;

    public static List<Employee> populateData() {

        BiFunction<String,Double,Employee> biFunction = (s, aDouble) -> new Employee(s,aDouble);
        List<Employee> list = new ArrayList<>();
        list.add((biFunction.apply("Durga",1000.0)));
        list.add((biFunction.apply("Sunny",2000.0)));
        list.add((biFunction.apply("Bunny",3000.0)));
        list.add((biFunction.apply("Chinny",4000.0)));
        return list;
    }

    public static void incrementSalary(List<Employee> employees) {

        BiConsumer<Employee,Double> biConsumer = (employee, aDouble) -> {
            double dIncrement = employee.getdSalary() + aDouble;
            System.out.println("Empployee Name - "+ employee.getStEmpName()+"  "+"has increment of ** " +
                    dIncrement);
            employee.setdSalary(dIncrement);
        };

        for(Employee employee : employees){
            biConsumer.accept(employee,INCREMENT_VALUE);
        }
    }
}
