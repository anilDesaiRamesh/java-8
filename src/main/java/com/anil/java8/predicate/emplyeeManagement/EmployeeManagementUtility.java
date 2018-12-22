package com.anil.java8.predicate.emplyeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagementUtility {
    public static List<Employee> populateData() {

        List<Employee> list = new ArrayList<>();
        list.add(getEmployee("Durga",EmployeeRole.CEO.toString(),30000,EmployeeLocation.HYDERABAD.toString()));
        list.add(getEmployee("Sunny",EmployeeRole.MANAGER.toString(),20000,EmployeeLocation.BANGALORE.toString()));
        list.add(getEmployee("Mallika",EmployeeRole.MANAGER.toString(),20000,EmployeeLocation.BANGALORE.toString()));
        list.add(getEmployee("Kareena",EmployeeRole.LEAD.toString(),15000,EmployeeLocation.HYDERABAD.toString()));
        list.add(getEmployee("Katrina",EmployeeRole.LEAD.toString(),15000,EmployeeLocation.BANGALORE.toString()));
        list.add(getEmployee("Anushka",EmployeeRole.DEVELOPER.toString(),10000,EmployeeLocation.HYDERABAD.toString()));
        list.add(getEmployee("Kanushka",EmployeeRole.DEVELOPER.toString(),10000,EmployeeLocation.HYDERABAD.toString()));
        list.add(getEmployee("Soumya",EmployeeRole.DEVELOPER.toString(),10000,EmployeeLocation.BANGALORE.toString()));
        list.add(getEmployee("Ramya",EmployeeRole.DEVELOPER.toString(),10000,EmployeeLocation.BANGALORE.toString()));
        return list;
    }

    private static Employee getEmployee(String stName, String stDesignation, double dSalary, String stCity) {
        return new Employee(stName,stDesignation,dSalary,stCity);
    }

    public static List<Employee> getManagers(List<Employee> employees) {

        List<Employee> managers = new ArrayList<>();
        for(Employee employee : employees) {
            if (checkManagerRoleEmployees(employee))
                managers.add(employee);
        }
        return managers;
    }

    private static boolean checkManagerRoleEmployees(Employee employee) {
        Predicate<Employee> predicate = employee1 -> employee1.getStDesignation().trim().
                equalsIgnoreCase(EmployeeRole.MANAGER.toString());
        return predicate.test(employee);
    }


    public static void printList(List<Employee> list) {

        for(Employee emp : list)
            System.out.println(emp);
    }

    public static List<Employee> getBangaloreEmployees(List<Employee> employees) {

        List<Employee> bangalores = new ArrayList<>();
        for(Employee emp : employees){
            if(checkEmployeeLocation(emp))
                bangalores.add(emp);

        }
        return bangalores;

    }

    private static boolean checkEmployeeLocation(Employee emp) {

        Predicate<Employee> predicate = employee -> employee.getStCity().trim().
                equalsIgnoreCase(EmployeeLocation.BANGALORE.toString());
        return predicate.test(emp);
    }

    public static List<Employee> checkSalaryLessThan20k(List<Employee> employees) {

        List<Employee> list = new ArrayList<>();
        for(Employee emp : employees){
            if(checkSalaryLessThan20K(emp))
                list.add(emp);
        }
        return list;
    }

    private static boolean checkSalaryLessThan20K(Employee emp) {

        Predicate<Employee> predicate = employee -> employee.getdSalary()<20000.00;
        return predicate.test(emp);
    }

    public static List<Employee> getBangaloreManagers(List<Employee> employees) {
        List<Employee> list = new ArrayList<>();
        for(Employee employee : employees){
            if(checkBangaloreManagers(employee))
                list.add(employee);
        }
        return list;

    }

    private static boolean checkBangaloreManagers(Employee employee) {

        Predicate<Employee> bangalore = employee1 -> employee1.getStCity().trim().
                equalsIgnoreCase(EmployeeLocation.BANGALORE.toString());
        Predicate<Employee> manager = employee1 -> employee1.getStDesignation().trim().
                equalsIgnoreCase(EmployeeRole.MANAGER.toString());
        return bangalore.and(manager).test(employee);
    }

    public static List<Employee> getManagersOrLessThan20k(List<Employee> employees) {

        List<Employee> list = new ArrayList<>();
        for(Employee employee : employees){
            if(checkManagersOrSalaryLessThan20k(employee))
                list.add(employee);
        }
        return list;
    }

    private static boolean checkManagersOrSalaryLessThan20k(Employee employee) {

        Predicate<Employee> managers = employee1 -> employee1.getStDesignation().trim().
                equalsIgnoreCase(EmployeeRole.MANAGER.toString());
        Predicate<Employee> salaryLessThan20k = employee1 -> employee1.getdSalary()<20000;
        return managers.or(salaryLessThan20k).test(employee);
    }


    public static List<Employee> getNotManagers(List<Employee> employees) {

        List<Employee> list = new ArrayList<>();
        for(Employee employee : employees){
            if(checkNotManagers(employee))
                list.add(employee);
        }
        return list;
    }

    private static boolean checkNotManagers(Employee employee) {

        /*Predicate<Employee> predicate=employee1 -> employee1.getStDesignation().trim()
                .equalsIgnoreCase(EmployeeRole.MANAGER.toString());*/
        //or
        Predicate<Object> predicate = Predicate.isEqual(EmployeeRole.MANAGER.toString());
        return predicate.negate().test(employee.getStDesignation());
    }
}
