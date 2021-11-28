package com.company;


import java.util.Objects;

public class EmployeeDetails implements Comparable<EmployeeDetails> {
        int identity;
        String Name;

        EmployeeDetails(int identity,String Name){
            this.Name=Name;
            this.identity=identity;
        }

        @Override
        public String toString(){
            return Name+" : "+identity;
        }
//
//        @Override
//        public boolean equals(Object o){
//            if(this= (EmployeeDetails) o) return true
//        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return identity == that.identity && Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, Name);
    }

    @Override
    public int compareTo(EmployeeDetails o) {
        return this.identity-o.identity;
    }
}
