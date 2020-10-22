package com.company;

public class Student extends Human{
    private double scholarship;
    private int course;

    public Student(String name, int age, int course, double scholarship){
        super(name, age);
        this.scholarship = scholarship;
        this.course = course;
    }

    public String info() {
        return super.info() + "\n\tScholarship: " + scholarship + "\n\tCourse: " + course + " ";
    }

    @Override
    public double getMoney(){
        return scholarship;
    }


}
