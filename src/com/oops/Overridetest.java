package com.oops;

class Employee {                                   
    public double calculateSalary() {
        return 25000;
    }                                   // parent class-different behaviour ---method same 
}

class Developer extends Employee {
    @Override
    public double calculateSalary() {
        return 70000;
    }                                     //child class 1 -different behaviour 
}

class Manager extends Employee {
    @Override
    public double calculateSalary() {   
        return 100000;
    }
}

public class Overridetest {
    public static void main(String[] args) {

        Employee emp = new Developer();
        Employee emp1 = new Manager();

        System.out.println("Developer Salary: " + emp.calculateSalary());  // In real life:All employees get salary ,,But salary differs for Developer, Manager, Tester


        System.out.println("Manager Salary: " + emp1.calculateSalary());
    }
}
