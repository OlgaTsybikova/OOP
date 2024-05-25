package com.example.zoo;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String countryOfOrigin, int age, int numberOfFeet, String food) {
        super(countryOfOrigin, age, numberOfFeet, food);
        
    }

    //@Override
    public void fly() {
        System.out.println("Sparrow flying high");
    }

}
