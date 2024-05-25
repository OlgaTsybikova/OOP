package com.example.zoo;

public abstract class Animal {
String countryOfOrigin;
int age;
int numberOfFeet;
String food;

public Animal(String countryOfOrigin, int age, int numberOfFeet, String food){
    this.countryOfOrigin = countryOfOrigin;
    this.age = age;
    this.food = food;

}

public void speak(){
    System.out.println("Hi, I am from "+ countryOfOrigin);
    System.out.println("I like to eat " + food);
}
public abstract void move();
}
