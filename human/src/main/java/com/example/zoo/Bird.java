package com.example.zoo;

public class Bird extends Animal{

 public Bird(String countryOfOrigin, int age, int numberOfFeet, String food) {
        super(countryOfOrigin, age, numberOfFeet, food);
       
    }

@Override
public void move() {
    System.out.println("It is flying..");
}

/* public void sing(){
    System.out.println("Singing...");
 } */
}
