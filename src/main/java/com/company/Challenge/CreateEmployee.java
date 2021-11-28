package com.company.Challenge;

public class CreateEmployee {

    String name ;
    int age;
    Double salary;
    String location;

    CreateEmployee(String name,int age,Double salary,String location){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.location=location;
    }

    public double raiseSalary(Double salary){
         return salary + (salary / 10);
    }

}
