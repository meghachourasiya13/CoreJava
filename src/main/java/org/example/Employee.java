package org.example;

public class Employee {

    String name;
    int empId;

    private int salary;

    public void display()
    {
        System.out.println(name);
        System.out.println(empId);
        System.out.println(salary);
    }

    public void setSalary(int sal)
    {
        this.salary = sal;
    }
}