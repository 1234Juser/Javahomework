package org.example.chap09.normal;

public class Manager extends Employee{
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void printInfo(){
        System.out.println("이름 : " +getName() + ", 연봉 : " +getSalary() + ", 부서 : " +department);
    }
}
