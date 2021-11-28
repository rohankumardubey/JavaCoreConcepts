package com.company;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int id;
    String dept;

    Student(int id,String name,String dept){
        this.name=name;
        this.id=id;
        this.dept=dept;

    }
}

class Department {
    String dept;
    List<Student> student;

  Department(String dept,List<Student> student){
      this.dept=dept;
      this.student=student;
  }

  public List<Student> getStudents(){
      return student;
  }

}

class Institute{
    String institute;
    List<Department> department;
    Institute(String institute,List<Department> department){
        this.institute=institute;
        this.department=department;
    }


    public int nofStudents(){

    int numberofstudent=0;

    for(Department dept : department){
        List<Student> students = dept.getStudents();
        for(Student student: students){
            numberofstudent+=1;
        }
    }
    return numberofstudent;
}


public static class StudentsProfile {
    public static void main(String[] args) {


        Student s1=new Student(1,"sam","cse");
        Student s2=new Student(2,"rock","eee");
        Student s3=new Student(3,"lee","cse");
        Student s4=new Student(4,"tenten","eee");

        //cse list
        List<Student> cse_list = new ArrayList<>();
        cse_list.add(s1);
        cse_list.add(s3);

        //cse list
        List<Student> eee_list = new ArrayList<>();
        eee_list.add(s2);
        eee_list.add(s4);

        Department cse = new Department("cse",cse_list);
        Department eee = new Department("eee",eee_list);

        //departments list
        List<Department> dept = new ArrayList<>();
        dept.add(cse);
        dept.add(eee);

        Institute institute = new Institute("MGIT",dept);
        System.out.println("number of students is : "+institute.nofStudents());
    }
}
}