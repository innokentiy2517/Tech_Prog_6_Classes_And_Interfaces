package com.company;

public abstract class Human implements getMoneyRequest {
    private String name;
    private int age;

    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String info(){
        return name + ":\n\tAge: " + age;
    }

    @Override
    public abstract double getMoney();

}
