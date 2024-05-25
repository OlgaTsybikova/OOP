package com.example.zoo;

public class Chicken extends Bird {

    public Chicken(String countryOfOrigin, int age, int numberOfFeet, String food) {
        super(countryOfOrigin, age, numberOfFeet, food);
        
    }
    public void sing(){
        System.out.println("Not singing...");
     }
    }
