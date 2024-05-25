package com.example.human;

public class Human {
    String name;
    int age; 
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Speaking");
        System.out.println("Hello! My name is " + name);
        System.out.println("I am "+ age +" y.o");
    }
}
