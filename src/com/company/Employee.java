package com.company;

public class Employee extends Human{
    private double salary;

    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public String info (){return super.info() + "\n\tSalary: " + salary;}

    @Override
    public double getMoney() {
        return salary;
    }
}
