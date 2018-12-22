package com.anil.java8.predicate.emplyeeManagement;

import java.util.List;

public class EmployeeManagementMain {

    public static void main(String[] args){

        List<Employee> employees = EmployeeManagementUtility.populateData();
        System.out.println(employees);
        System.out.println();
        System.out.println("*********List of Managers Start**********");
        List<Employee> managers = EmployeeManagementUtility.getManagers(employees);
        EmployeeManagementUtility.printList(managers);
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("*********List of Bangalore Employees**********");
        List<Employee> bangalores = EmployeeManagementUtility.getBangaloreEmployees(employees);
        EmployeeManagementUtility.printList(bangalores);
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("*********List of Employees with Salary less than 20K **********");
        List<Employee> salaryLessthan20k  = EmployeeManagementUtility.checkSalaryLessThan20k(employees);
        EmployeeManagementUtility.printList(salaryLessthan20k);
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("*********List of Managers from Bangalore **********");
        List<Employee> bangaloreManagers  = EmployeeManagementUtility.getBangaloreManagers(employees);
        EmployeeManagementUtility.printList(bangaloreManagers);
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("*********List of employees with Role Manager ot salary less than 20k **********");
        List<Employee> managersOrSalLess20K  = EmployeeManagementUtility.getManagersOrLessThan20k(employees);
        EmployeeManagementUtility.printList(managersOrSalLess20K);
        System.out.println("*****************************************");
        System.out.println();

        System.out.println("*********List of employees with Role NOT Manager**********");
        List<Employee> notManagers  = EmployeeManagementUtility.getNotManagers(employees);
        EmployeeManagementUtility.printList(notManagers);
        System.out.println("*****************************************");
        System.out.println();

    }
}
