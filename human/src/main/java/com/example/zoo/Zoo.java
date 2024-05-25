package com.example.zoo;

public class Zoo {
 public static void main(String[] args) {

    Bird bird1 = new Bird("South africa", 0, 2, "worms");
    bird1.speak();

    Animal chick1 = new Chicken("Russia", 1, 2, "grains");
    //chick1.move();
    Animal sparrow = new Sparrow("Hungary", 0, 0, "worms");
    //sparrow.move();
   moveAnimal(sparrow);
   moveAnimal(chick1);
  
 }
 public static void moveAnimal(Animal animal){
   animal.move();
 }

 Flyable flyingBird = new Sparrow("CHINA", 0, 0, "Flies");

 
};
