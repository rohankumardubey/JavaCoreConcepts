package com.company.Challenge;

public class Main {
    public static void main(String[] args) {
        CreateEmployee emp = new CreateEmployee("rohan",22,20000d,"hyderabad");
        System.out.println(emp.salary);
        System.out.println(emp.raiseSalary(emp.salary));
        System.out.println(emp.raiseSalary(emp.raiseSalary(emp.salary)));
        System.out.println(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.salary))));
        System.out.println(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.salary)))));
        System.out.println(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.raiseSalary(emp.salary))))));
    }
}
