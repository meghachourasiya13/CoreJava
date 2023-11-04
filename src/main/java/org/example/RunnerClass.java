package org.example;

public class RunnerClass {

    public static void main(String args[])
    {
        Employee emp1 = new Employee();
        emp1.name = "Megha";
        emp1.empId = 100;
        emp1.setSalary(1000);

        Employee emp2 = new Employee();
        emp2.name = "Krati";
        emp2.empId = 101;
        emp2.setSalary(2000);
        emp1.display();

        emp2.display();

    }
}
