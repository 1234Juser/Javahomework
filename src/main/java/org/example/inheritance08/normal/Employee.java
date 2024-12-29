package org.example.inheritance08.normal;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("이름 : " + name + ", 연봉 : " + salary);

    }
}
